package tree.avltree.avltree_a;

/**
 * @author ronin
 */
public class AVLTreeTest {
    public static void main(String[] args) {
        /**
         * 测试左旋转
         */
        int[] arrLeft = {4,3,6,5,7,8};
        //创建要给AVLTree对象
        AVLTree avlTreeLeft = new AVLTree();
        //添加节点
        for (int i = 0; i < arrLeft.length; i++) {
            avlTreeLeft.add(new Node(arrLeft[i]));
        }
        //中序遍历
        avlTreeLeft.infixOrder();
        System.out.println("进行左旋处理~");
        System.out.println("树的高度:"+avlTreeLeft.getRoot().height());
        System.out.println("左子树高度:"+avlTreeLeft.getRoot().leftHeight());
        System.out.println("右子树高度:"+avlTreeLeft.getRoot().rightHeight());
        System.out.println("当前的根节点:"+avlTreeLeft.getRoot());
        System.out.println("当前的根节点的左节点:"+avlTreeLeft.getRoot().left);
        System.out.println("当前的根节点的右节点:"+avlTreeLeft.getRoot().right);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        /**
         * 测试右旋转
         */
        int[] arrRight = {10,12,8,9,7,6};
        AVLTree avlTreeRight = new AVLTree();
        //添加节点
        for (int i = 0; i < arrRight.length; i++) {
            avlTreeRight.add(new Node(arrRight[i]));
        }
        //中序遍历
        avlTreeRight.infixOrder();
        System.out.println("进行右旋处理~");
        System.out.println("树的高度:"+avlTreeRight.getRoot().height());
        System.out.println("左子树高度:"+avlTreeRight.getRoot().leftHeight());
        System.out.println("右子树高度:"+avlTreeRight.getRoot().rightHeight());
        System.out.println("当前的根节点:"+avlTreeRight.getRoot());
        System.out.println("当前的根节点的左节点:"+avlTreeRight.getRoot().left);
        System.out.println("当前的根节点的右节点:"+avlTreeRight.getRoot().right);
    }
}
