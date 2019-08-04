package linkedlist.linkedlist_a;


/**
 * 测试英雄链表
 * @author ronin
 */
public class HeroLinkedListTest {
    public static void main(String[] args) {
        //宋江
        Node songjiang = new Node(1, "宋江", "及时雨");
        //晁盖
        Node chaogai = new Node(2, "晁盖", "托塔天王");
        //吴用
        Node wuyong = new Node(3, "吴用", "智多星");
        //林冲
        Node linchong = new Node(4, "林冲", "豹子头");
        //插入一个节点
        HeroLinkedList heroLinkedList = new HeroLinkedList();
        heroLinkedList.add(songjiang);
        heroLinkedList.add(chaogai);
        heroLinkedList.add(linchong);
        heroLinkedList.add(wuyong);
        heroLinkedList.list();
    }
}
