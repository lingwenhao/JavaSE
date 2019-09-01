package tree.avltree.avltree_a;

/**
 * avl是在平衡二叉树的基础上增加一个功能的树
 * @author ronin
 */
public class AVLTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 查找要删除的节点
     * @param value
     */
    public Node search(int value){
        if(root == null){
            return null;
        }
        return root.search(value);
    }

    /**
     * 查找要删除的父节点
     * @param value
     */
    public Node searchParent(int value){
        if(root == null){
            return null;
        }
        return root.searchParent(value);
    }

    /**
     * 删除节点
     */
    public void delNode(int value){
        if(root == null){
            return;
        }else{
            //1.先找到要删除的节点targetNode
            Node targetNode = search(value);
            //如果没有找到目标节点,则结束程序
            if(targetNode == null){
                return;
            }
            //如果我们发现当前这颗二叉排序树只有一个节点
            if(root.left == null && root.right == null){
                root = null;
                return;
            }
            //找到targetNode的父节点
            Node parent = searchParent(value);
            //如果要删除的节点是叶子节点
            if(targetNode.left == null && targetNode.right == null){
                //判断targetNode是父节点的左子节点还是右子节点
                if(parent.left != null && parent.left.value == value){
                    //是左子节点
                    parent.left = null;
                }else if(parent.right != null && parent.right.value == value){
                    //是右子节点
                    parent.right = null;
                }
            }else if(targetNode.left != null && targetNode.right != null){//删除有两棵子树的节点
                int minValue = delRightTreeMin(targetNode.right);
                targetNode.value = minValue;

            }else{//删除只有一颗子树的节点

                //如果要删除的节点有左子节点
                if(targetNode.left !=null){
                    if(parent != null) {
                        //如果targetNode是parent的左子节点
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        } else {
                            //如果targetNode是parent的右子节点
                            parent.right = targetNode.left;
                        }
                    }else {
                        root = targetNode.left;
                    }
                }else{//如果要删除的节点有右子节点
                    if(parent != null) {
                        //如果targetNode是parent的左子节点
                        if (parent.left.value == value) {
                            parent.left = targetNode.right;
                        } else {
                            //如果targetNode是parent的右子节点
                            parent.right = targetNode.right;
                        }
                    }else{
                        root = targetNode.right;
                    }
                }
            }
        }
    }

    /**
     *
     * @param node 传入的节点(当作二叉排序树的根节点)
     * @return 返回以node为根节点的二叉排序树的最小节点的值
     */
    public int delRightTreeMin(Node node){
        Node target = node;
        //循环的查找左节点,就会找到最小值
        while(target.left != null){
            target = target.left;
        }
        //这时target就指向了最小的节点
        delNode(target.value);
        return target.value;
    }

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
     * 返回左子树高度
     * @return
     */
    public int leftHeight(){
        if(left == null){
            return 0;
        }
        return  left.height();
    }

    /**
     * 返回左子树高度
     * @return
     */
    public int rightHeight(){
        if(right == null){
            return 0;
        }
        return  right.height();
    }

    /**
     * 返回以该节点为根节点的树的高度
     * @return
     */
    public int height(){
        return Math.max(left == null ? 0 : left.height(),right == null ? 0 : right.height())+1;
    }

    /**
     * 左旋转
     *  每次添加一个节点后要判断是否要进行左旋转
     */
    public void leftRotate(){
        //创建新节点,以当前根节点的值
        Node newNode = new Node(value);
        //把新节点的左子树设置成当前节点的左子树
        newNode.left = left;
        //把新节点的右子树设置成当前节点的右子树的左子树
        newNode.right = right.left;
        //把当前节点的值替换成右子节点的值
        value = right.value;
        //把当前节点的右子树设置成当前节点的右子树的右子树
        right = right.right;
        //把当前节点的左子树设置成新的节点
        left = newNode;
    }

    /**
     * 右旋转
     *  每次添加一个节点后要判断是否要进行左旋转
     */
    public void rightRotate(){
        //创建新节点,以当前根节点的值
        Node newNode = new Node(value);
        //把新节点的右子树设置成当前节点的右子树
        newNode.right = right;
        //把新节点的左子树设置成当前节点的左子树的右子树
        newNode.left = left.right;
        //把当前节点的值替换成左子节点的值
        value = left.value;
        //把当前节点的左子树设置成当前节点的左子树的左子树
        left = left.left;
        //把当前节点的左子树设置成新的节点
        right = newNode;
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

        //当添加完一个节点后,右子树的高度减去左子树的高度的值大于1,则左旋转
        if(rightHeight() - leftHeight() > 1){
            //如果右子树的左子树的高度大于右子树的右子树的高度
            if(right != null && right.leftHeight() > right.rightHeight()){
                //先对右子节点进行右旋转
                right.rightRotate();
                //在对当前节点进行左旋转
                leftRotate();
            }else{
                //否则直接进行左旋即可
                leftRotate();
            }
            //这里必须返回
            return;
        }
        //当添加完一个节点后,左子树的高度减去右子树的高度的值大于1,则右旋转
        if(leftHeight() - rightHeight() > 1){
            //如果左子树的右子树的右子树高度大于左子树高度
            if(left != null && left.rightHeight() > left.leftHeight()){
                //先对当前节点的左节点(左子树)->左节点
                left.leftRotate();
                //再对当前节点进行右旋转
                rightRotate();
            }else {
                //否则:直接进行右旋转即可
                rightRotate();
            }
        }
    }

    /**
     * @param value 希望删除的节点的值
     * @return 如果找到返回该节点的值,否则返回null
     */
    public Node search(int value){
        if(value == this.value){
            return this;
        }else if(value < this.value){
            //如果查找的值小于当前节点,向左子树递归查找
            if(this.left == null){
                return null;
            }
            return this.left.search(value);
        }else {
            //如果查找的值不小于当前节点,向右子树递归查找
            if(this.right == null){
                return null;
            }
            return this.right.search(value);
        }
    }

    /**
     * 查找要删除的节点
     * @param value
     * @return
     */
    public Node searchParent(int value){
        //如果当前节点就是要删除的节点的父节点,就返回
        if((this.left !=null && this.left.value == value)||
                this.right != null && this.right.value == value){
            return this;
        }else{
            //如果查找的值小于当前节点的值,并且当前节点的左子节点不为空
            if(value < this.value && this.left != null){
                return this.left.searchParent(value);
            }else if(value >= this.value && this.right != null){
                return this.right.searchParent(value);
            }else{
                //没有找到父节点
                return null;
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