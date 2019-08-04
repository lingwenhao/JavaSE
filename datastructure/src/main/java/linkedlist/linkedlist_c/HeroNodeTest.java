package linkedlist.linkedlist_c;

/**
 * 双向链表测试
 * @author ronin
 */
public class HeroNodeTest {
    public static void main(String[] args) {
        Node songjiang = new Node(1, "宋江", "及时雨");
        Node chaogai = new Node(2, "晁盖", "托塔天王");
        Node wuyong = new Node(3, "吴用", "智多星");
        Node linchong = new Node(4, "林冲", "豹子头");
        HeroLinkedList heroLinkedList = new HeroLinkedList();
        heroLinkedList.add(linchong);
        heroLinkedList.add(songjiang);
        heroLinkedList.add(chaogai);
        heroLinkedList.add(wuyong);
        //heroLinkedList.list();

        //更新链表节点
        System.out.println("--------------------------------------------------");
        Node updateNode = new Node(3, "吴用1", "智多星1");
        heroLinkedList.update(updateNode);
        heroLinkedList.list();

        //删除节点
        System.out.println("--------------------------------------------------");
        Node removeNode = new Node(4, "林冲", "豹子头");
        heroLinkedList.remove(removeNode);
        heroLinkedList.list();


    }
}
