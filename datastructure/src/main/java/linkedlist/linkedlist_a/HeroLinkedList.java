package linkedlist.linkedlist_a;

/**
 * 链表模拟梁山108英雄排行榜
 * @author ronin
 */
public class HeroLinkedList {

    /**初始化一个头节点*/
    private Node headNode = new Node(0,"","");

    /**
     * 插入一个节点
     * @param hero 要插入的目标英雄
     * @return 插入成功返回插入的英雄
     */
    public Node add(Node hero){
        //tips:链表的插入需要把要插入的目标节点插入到最后一个节点,初始化的时候使调度节点指向链表中第一个节点
        Node tempNode = headNode;
        while(true){
            if(null == tempNode.next) {
                //如果当前的节点的下一个节点为空，则结束循环
                break;
            }
            tempNode = tempNode.next;
        }
        tempNode.next = hero;
        return hero;
    }

    public void list() {
        Node tempNode = headNode;
        //判断链表是否为空
        if(null == tempNode.next) {
            return;
        }
        while(null != tempNode.next){
            System.out.println(tempNode.next);
            tempNode = tempNode.next;
        }
    }
}

class Node{
    /**英雄编号*/
    private int heroNo;
    /**英雄名称*/
    private String heroName;
    /**英雄昵称*/
    private String nickName;
    /**持有下一个英雄节点的引用*/
    protected Node next;

    /**
     * 构造方法
     * @param heroNo 英雄编号
     * @param heroName 英雄名称
     * @param nickName 英雄名称
     */
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
