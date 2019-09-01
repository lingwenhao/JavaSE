package tree.arraybinarytree.arraybinarytree_a;

/**
 * @author ronin
 */
public class ArrayBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        BinaryTree binaryTree = new BinaryTree(arr);
        binaryTree.peOrder();
    }

}

class BinaryTree{
    /**
     * 要遍历的数组
     */
    private int[] arr;

    public BinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void peOrder(){
        this.preOrder(0);
    }
    /**
     * 前序遍历：根->左->右
     * @param index 索引
     */
    private void preOrder(int index){
        if(arr==null || arr.length == 0){
            System.out.println("空数组......");
        }
        //输出当前元素
        System.out.print(arr[index]+"\t");
        //向左递归遍历
        if((index*2+1) < arr.length){
            preOrder(index*2+1);
        }
        //向右递归遍历
        if((index*2+2) < arr.length){
            preOrder(index*2+2);
        }
    }
}
