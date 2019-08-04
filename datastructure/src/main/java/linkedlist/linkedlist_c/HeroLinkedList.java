package linkedlist.linkedlist_c;


import java.util.Stack;

/**
 * 根据序号确定元素在链表中存放的顺序
 * @author ronin
 */
public class HeroLinkedList {
    private Node headNode = new Node(0,"","");


    public HeroLinkedList() {

    }

    public HeroLinkedList(Node headNode) {
        this.headNode = headNode;
    }

    /**
     * 新增加一个节点
     * @param node 新增加的目标节点
     * @return 当前操作的节点
     */
    public Node add(Node node){
        Node tempNode = headNode;
        while(true){
            //说明temNode已经是链表中最后一个元素
            if(null == tempNode.next){
                break;
            }
            if(tempNode.next.heroNo > node.heroNo){
                Node temp = tempNode.next;
                tempNode.next = node;
                node.next = temp;
                temp.prev = node;
                break;
            }
            tempNode = tempNode.next;
        }
        tempNode.next = node;
        node.prev = tempNode;
        return node;
    }

    /**
     * 更新链表节点
     * @param node 要删除的目标节点
     * @return 当前操作的节点
     */
    public Node update(Node node){
        Node tempNode = headNode;
        while (true){
            if(null == tempNode.next){
                System.out.println("链表为空~");
                break;
            }
            if(tempNode.heroNo == node.heroNo){
                break;
            }
            tempNode = tempNode.next;
        }
        tempNode.heroName = node.heroName;
        tempNode.nickName = node.nickName;
        return node;
    }

    /**
     * 删除节点:可以实现自我删除
     * @param node 要删除的目标节点
     * @return 当前操作的节点
     */
    public Node remove(Node node){
        Node tempNode = headNode.next;
        while(true){
            if(null == tempNode){
                break;
            }
            if(tempNode.heroNo == node.heroNo){
                tempNode.prev.next = tempNode.next;
                if(null != tempNode.next){
                    tempNode.next.prev = tempNode.prev;
                }
            }
            tempNode = tempNode.next;
        }
        return node;
    }

    /**
     * 获取链表中有效节点的个数
     * @return
     */
    public int size(){
        Node tempNode = headNode;
        int length = 0;
        while (true){
            if(null == tempNode.next){
                break;
            }
            tempNode = tempNode.next;
            length++;
        }
        return length;
    }

    /**
     * 获取链表中倒数第n个节点的元素
     * @param index
     * @return
     */
    public Node getReverseNode(int index){
        int size = this.size();
        if(index <=0 || index > size){
            System.out.println("索引值不合法~");
            return null;
        }
        Node tempNode = headNode;
        int currentIndex = 0;
        while (true){
            if(null == tempNode.next){
                break;
            }
            if(currentIndex == (size - index+1)){
                break;
            }
            tempNode = tempNode.next;
            currentIndex++;
        }
        return tempNode;
    }

    /**
     * 反转链表
     */
    public void reverse(){
        if(null == headNode.next){
            System.out.println("链表为空~");
            return;
        }
        Node currentNode = headNode.next;
        Node next =null;
        Node reverseHeadNode = new Node(0,"","");
        while(null != currentNode){
            next = currentNode.next;
            currentNode.next = reverseHeadNode.next;
            reverseHeadNode.next = currentNode;
            currentNode = next;
        }
        headNode.next = reverseHeadNode.next;
    }

    /**
     * 反转链表
     */
    public HeroLinkedList reverseHasResult(){
        if(null == headNode.next){
            System.out.println("链表为空~");
            return null;
        }
        Node currentNode = headNode.next;
        Node next =null;
        Node reverseHeadNode = new Node(0,"","");
        while(null != currentNode){
            next = currentNode.next;
            currentNode.next = reverseHeadNode.next;
            reverseHeadNode.next = currentNode;
            currentNode = next;
        }
        headNode.next = reverseHeadNode.next;
        return new HeroLinkedList(headNode);
    }

    /**
     * 根据节点的序号合并链表
     * @param l1
     * @param l2
     */
    public HeroLinkedList merge(HeroLinkedList l1, HeroLinkedList l2){
        if(null == l1){
            return l2;
        }
        if(null == l2){
            return l1;
        }

        HeroLinkedList heroLinkedList = null;
        if(l1.headNode.heroNo > l2.headNode.heroNo){
            heroLinkedList.headNode = l2.headNode;
            l2.headNode = l2.headNode.next;
            heroLinkedList.headNode.next = merge(l1,l2).headNode;
        }else {
            heroLinkedList.headNode = l1.headNode;
            l1.headNode = l1.headNode.next;
            heroLinkedList.headNode.next = merge(l1,l2).headNode;
        }
        return heroLinkedList;
    }

    /**
     * 从头到尾遍历链表
     */
    public void list(){
        //头指针
        Node pHead = headNode;
        System.out.println(pHead);
        if(null == pHead.next){
            System.out.println("链表为空......");
            return;
        }
        Node currentNode = pHead.next;
        while (null != currentNode){
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    /**
     * 从尾到头遍历链表:不破坏链表的数据结构
     */
    public void reverseList(){
        //头指针
        Node pHead = headNode;
        if(null == pHead.next){
            System.out.println("链表为空......");
            return;
        }
        Node currentNode = pHead.next;
        Stack<Node> nodeStack = new Stack<>();
        while (null != currentNode){
            nodeStack.push(currentNode);
            currentNode = currentNode.next;
        }

        while (nodeStack.size() > 0) {
            System.out.println(nodeStack.pop());
        }
    }
}

class Node{
    protected int heroNo;
    protected String heroName;
    protected String nickName;
    /**当前节点的下一个节点*/
    protected Node next;
    /**当前节点的上一个节点*/
    protected Node prev;

    public Node(int heroNo, String heroName, String nickName) {
        this.heroNo = heroNo;
        this.heroName = heroName;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "heroNo=" + heroNo +
                ", heroName='" + heroName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
