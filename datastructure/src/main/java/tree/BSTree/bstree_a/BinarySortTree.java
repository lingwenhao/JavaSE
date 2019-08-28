package tree.BSTree.bstree_a;

/**
 * @author ronin
 */
public class BinarySortTree {
    private Node root;

    /**
     * 添加节点
     * @param node
     */
    public void add(Node node){
        if(root == null){
            root = node;
        }else {
            root.add(node);
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){
        if(root == null){
            return;
        }
        root.infixOrder();
    }

}
class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 增加节点
     * @param node
     */
    public void add(Node node){
        if(node == null){
            return;
        }
        //判断传入的节点的值和当前子树根节点的关系
        if(node.value < this.value){
            if(this.left == null){
                this.left = node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right == null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){
        if(this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right != null){
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
