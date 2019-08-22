package tree.binarytree.binarytree_c;

/**
 * @author ronin
 */
public class ThreadBinaryTree {
    private Node root;
    private Node prev;

    public ThreadBinaryTree(Node root) {
        this.root = root;
    }

    //重载
    public void threadNodes(){
        this.threadNodes(root);
    }

    //为了实现线索化，需要创建给指向当前节点的前驱节点的指针
    /**
     * 线索化
     */
    public void threadNodes(Node node){
        //node为空，不能线索化
        if(node == null){
            return;
        }
        //线索化左子节点
        threadNodes(node.getLeft());
        //线索化当前节点
            //左子节点为空
        if(null == node.getLeft()){
            //让当前节点的左指针指向前驱节点
            node.setLeft(prev);
            //修改当前节点的左指针的类型，指向前驱节点
            node.setLeftType(1);
        }
        //处理后继节点
        if(prev != null && prev.getRight() != null){
            prev.setRight(node);
            prev.setRightType(1);
        }
        //每处理一个节点后，让当前节点成为下一个节点的前驱节点
        prev = node;
        //线索化右子节点
        threadNodes(node.getRight());
    }
}
class Node{
    private int id;
    private String name;
    private Node left;
    private Node right;

    //0:表示指向左子节点 1:表示指向右子节点
    private int leftType;
    private int rightType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
