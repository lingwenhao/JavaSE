package tree.binarytree.binarytree_a;

/**
 * <pre>
 *                          宋江
 *                  吴用               卢俊义
 *                              关胜      林冲
 * <pre/>
 * @author ronin
 */
public class BinaryTest {
    public static void main(String[] args) {
        //创建节点
        Node songjiang = new Node(1, "宋江");
        Node wuyong = new Node(2, "吴用");
        Node lujunyi = new Node(3, "卢俊义");
        Node linchong = new Node(4, "林冲");
        Node guanshegn = new Node(5, "关胜");
        songjiang.setLeft(wuyong);
        songjiang.setRight(lujunyi);
        lujunyi.setRight(linchong);
        lujunyi.setLeft(guanshegn);
        //创建二叉树
        BinaryTree binaryTree = new BinaryTree();
        //设置根节点
        binaryTree.setRoot(songjiang);


        System.out.println("-----------------------");
        //前序遍历:根->左->右
        binaryTree.preorderTravel();
        System.out.println("------------q-----------");
        //中序遍历:左->根->右
        binaryTree.infixorderTravel();
        System.out.println("------------z-----------");
        //后序遍历:左->右->根
        binaryTree.sufixorderTravle();
        System.out.println("------------h-----------");


        System.out.println("=============================================");
        //前序查找
        System.out.println("前序查找:" + binaryTree.preorderSearch(1));
        //中序查找
        System.out.println("中序查找:" + binaryTree.infixorderSearch(1));
        //后序查找
        System.out.println("后序查找:" + binaryTree.sufixorderSearch(5));
        System.out.println("=============================================");

        //删除节点
        binaryTree.deleteByNo(5);
        binaryTree.deleteByNo(3);

        System.out.println("-------------------------------");
        //前序遍历:根->左->右
        binaryTree.preorderTravel();

    }
}
