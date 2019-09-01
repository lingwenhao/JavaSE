package tree.threadbinarytree.threadbinarytree_a;

/**
 * @author ronin
 */
public class ThreadBinaryTreeTest {
    public static void main(String[] args) {
        Node root = new Node(1, "tom");
        Node node2 = new Node(3, "jack");
        Node node3 = new Node(6, "smith");
        Node node4 = new Node(8, "mary");
        Node node5 = new Node(10, "king");
        Node node6 = new Node(14, "dim");

        root.setLeft(node2);
        root.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);

        //测试线索化
        ThreadBinaryTree threadBinaryTree = new ThreadBinaryTree(root);
        threadBinaryTree.threadNodes();

        //以10号节点为例
        Node leftNode = node5.getLeft();
        Node rightNode = node5.getRight();
        System.out.println("10号节点的前驱节点:"+leftNode);
        System.out.println("10号节点的后继节点:"+rightNode);
    }
}
