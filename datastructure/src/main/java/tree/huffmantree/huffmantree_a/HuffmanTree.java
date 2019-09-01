package tree.huffmantree.huffmantree_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ronin
 */
public class HuffmanTree {
    public static void main(String[] args) {
        int arr[] = {13,7,8,3,29,6,1};
        Node root = createufmanTree(arr);
        System.out.println("-------------------------");
        preOrder(root);
    }

    /**
     * 创建赫夫曼树
     * @param arr
     */
    public static Node createufmanTree(int[] arr){
        //1.遍历arr数组
        //2.将arr的每个元素构成一个Node
        //3.将Node放入到ArrayList中
        List<Node> nodes = new ArrayList<Node>();
        for (int i : arr) {
            nodes.add(new Node(i));
        }
        while(nodes.size()>1){
            //排序从小到大
            Collections.sort(nodes);
            System.out.println(nodes);
            //1.取出权值最小的两棵二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            //2.构建一棵新的二叉树
            Node parent = new Node(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;
            //3.从ArrayList中删除处理过的节点
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //4.将parent节点加入到Nodes节点
            nodes.add(parent);
            Collections.sort(nodes);
            System.out.println(nodes);
        }
        //返回赫夫曼树的根节点
        return nodes.get(0);
    }

    /**
     * 根节点
     * @param root
     */
    public static void preOrder(Node root){
        if(root == null){
            System.out.println("空树~");
            return;
        }
        root.preOrder();
    }
}
class Node implements Comparable<Node>{
    //节点权值
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
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
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        //表示从小到大
        return this.value - o.value;
    }
}