package tree.huffmantree.huffmantree_b;

import java.util.*;

/**
 * @author ronin
 */
public class HaffmanCode {
    /**
     * 生成赫夫曼树对应的赫夫曼编码:
     *  1.将赫夫曼编码表存放在Map<Byte,String>形式
     *      32->01 97->100 100->11000等形式
     *  2.在生成赫夫曼编码表时，需要去拼接路径，定义一个StringBuilder，存储某个叶子节点的路径
     */
    static Map<Byte,String> huffmanCodes = new HashMap<Byte,String>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        String content = "i like like like java do you like a java";
        byte[] bytes = content.getBytes();
        System.out.println("原始字符串对应的字节数组:"+Arrays.toString(bytes));
        System.out.println("原始字符串对应的字节数组的长度:"+bytes.length);
        List<Node> nodes = getNodes(bytes);
        System.out.println("---------------------------------------------");
        System.out.println(nodes);
        Node root = ceateHuffmanTree(nodes);
        System.out.println("赫夫曼树根节点:"+root);
        System.out.println("---------------------------------------------");
        //前序遍历赫夫曼树
        //preOrder(root);
        System.out.println("---------------------------------------------");
        //获取赫夫曼编码表
        getHuffmanCodes(root,"",stringBuilder);

        getHuffmanCodes(root);
        System.out.println("赫夫曼编码表:"+huffmanCodes);

        //压缩
        byte[] zipSource = zip(bytes, huffmanCodes);
        System.out.println("huffmanCode处理过后的字节数组:"+Arrays.toString(zipSource));
        System.out.println("huffmanCode处理过后的字节数组的长度:"+zipSource.length);

        //解码
        byte[] decodeTarget = deode(huffmanCodes, zipSource);
        System.out.println("huffmanCode还原过后的字节数组:"+Arrays.toString(decodeTarget));
        System.out.println("huffmanCode还原过后的字节数组的长度:"+decodeTarget.length);
        System.out.println("还原后的字符串:"+new String(decodeTarget));
    }

    /**
     * @param huffmanCodes 赫夫曼编码表
     * @param huffmanBytes
     * @return
     */
    private static byte[] deode(Map<Byte,String> huffmanCodes,byte[] huffmanBytes){
        //1.得到赫夫曼数组对应的二进制字符串
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<huffmanBytes.length;i++){
            byte b = huffmanBytes[i];
            //判断是不是最后要给字节
            boolean flag = (i == huffmanBytes.length-1);
            stringBuilder.append(binaryToString(!flag,b));
        }
        System.out.println("赫夫曼字节数组对应的二进制字符串:"+stringBuilder.toString());

        //解码
        HashMap<String,Byte> reverseHuffmanMap = new HashMap<>();
        for(Map.Entry<Byte,String> entry:huffmanCodes.entrySet()){
            reverseHuffmanMap.put(entry.getValue(),entry.getKey());
        }
        System.out.println("reverseHuffmanMap:"+reverseHuffmanMap);

        //创建集合，存放byte
        ArrayList<Byte> list = new ArrayList<>();
        for(int i=0;i<stringBuilder.length();){
            int count = 1;
            boolean flag = true;
            Byte charElement = null;
            while(flag){
                //取出一个'1' '0'
                    //i不动，让count移动，指定匹配到一个字符
                String key = stringBuilder.substring(i,count+i);
                charElement = reverseHuffmanMap.get(key);
                if(charElement == null){
                    //说明没有匹配到
                    count++;
                }else{
                    //匹配到
                    flag = false;
                }
            }
            list.add(charElement);
            //i直接移动到count的位置
            i += count;
        }
        byte[] bytes = new byte[list.size()];
        for(int i=0;i<bytes.length;i++){
            bytes[i] = list.get(i);
        }
        return bytes;
    }

    /**
     *
     * @param flag 是否需要补高位,true:需要 false:不需要，如果是最后一个字节不需要补高位
     * @param b
     * @return b对应的补码格式的二进制字符串
     */
    private static String binaryToString(boolean flag,byte b){
        int temp = (int)b;
        if(flag) {
            //正数补高位
            temp |= 256;
        }
        //int对应的二进制的补码
        String str = Integer.toBinaryString(temp);
        if(flag){
            return str.substring(str.length()-8);
        }else{
            return str;
        }
    }

    /**
     * 根据字节数组生成List<Node>
     * @param bytes
     * @return
     */
    private static List<Node> getNodes(byte[] bytes){
        //1.创建一个ArrayList
        List<Node> nodes = new ArrayList<Node>();
        HashMap<Byte, Integer> counts = new HashMap<>();
        //2.遍历bytes,统计每一个byte出现的次数,map[key,value]
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if(count == null){
                counts.put(b,1);
            }else {
                counts.put(b,++count);
            }
        }
        //3.把每一个键值对转换成一个Node对象，并放入到Nodes集合中
        for(Map.Entry<Byte,Integer> entry:counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;
    }

    /**
     * 使用huffmanCode压缩原始的字节数组
     * @param bytes 原始的字符串对象的bytes[]
     * @param huffmanCode 保存赫夫曼编码的Map
     */
    public static byte[] zip(byte[] bytes,Map<Byte,String> huffmanCode){
        //1.将bytes转换成赫夫曼编码对应的字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (Byte b : bytes) {
            stringBuilder.append(huffmanCodes.get(b));
        }
        System.out.println("赫夫曼字节数组对应的二进制字符串"+stringBuilder.toString());
        System.out.println("赫夫曼字节数组对应的二进制字符串的长度:"+stringBuilder.toString().length());
        //2.将对应和赫夫曼编码数据抓换为byte[]
            //统计数据的长度
        int len = stringBuilder.length()%8 ==0 ?stringBuilder.length()/8 : stringBuilder.length()/8+1;
        byte[] huffmanCodeBytes = new byte[len];
        int index = 0;
        for(int i=0;i<stringBuilder.length();i+=8){
            String substring;
            if(i+8 > stringBuilder.length()) {
                substring = stringBuilder.substring(i);
            }else{
                substring = stringBuilder.substring(i, i + 8);
            }
            huffmanCodeBytes[index] = (byte)Integer.parseInt(substring,2);
            index++;
        }
        return huffmanCodeBytes;
    }

    /**
     * 创建赫夫曼树
     * @param nodes
     */
    private static Node ceateHuffmanTree(List<Node> nodes){
        while(nodes.size()>1){
            //1.排序
            Collections.sort(nodes);
            //2.获取权值最小的二叉树和权值次小的二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            //3.根据获取到的两个节点的创建新的二叉树
            Node parent = new Node(null, leftNode.weight + rightNode.weight);
            parent.left = leftNode;
            parent.right = rightNode;
            //4.把parent加入到nodes中
            nodes.add(parent);
            //5.从list中删除两个节点
            nodes.remove(leftNode);
            nodes.remove(rightNode);
        }
        //6.返回根节点
        return nodes.get(0);
    }

    /**
     * 前序遍历
     * @param root
     */
    public static void preOrder(Node root){
        if(root == null){
            System.out.println("数为空~");
            return;
        }
        root.preOrder();
    }

    /**
     * 获取赫夫曼编码
     * @param root
     */
    public static void getHuffmanCodes(Node root){
        if(root == null){
            return;
        }
        //处理root的左子树
        getHuffmanCodes(root.left,"0",stringBuilder);
        //处理root的右子树
        getHuffmanCodes(root.right,"1",stringBuilder);
    }

    /**
     *
     * @param node 传入的节点
     * @param code 路径:左子节点时0，右子节点1
     * @param stringBuilder 用于拼接路径
     */
    public static void getHuffmanCodes(Node node,String code,StringBuilder stringBuilder){
        StringBuilder temp = new StringBuilder(stringBuilder);
        temp.append(code);
        if(node != null){
            //判断当前节点时叶子节点还是非叶子节点
            if(node.data == null){
                //向左递归
                getHuffmanCodes(node.left,"0",temp);
                //向右递归
                getHuffmanCodes(node.right,"1",temp);
            }else{
                //说明是一个叶子节点
                huffmanCodes.put(node.data,temp.toString());
            }
        }
    }
}

class Node implements Comparable<Node>{
    /**
     * 存放数据本身，如:'a'->97  ' '->32
     */
    Byte data;
    /**
     * 权值，表示字符出现的次数
     */
    int weight;
    Node left;
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }

    @Override
    public int compareTo(Node o) {
        //从小到大排序
        return this.weight -o.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}
