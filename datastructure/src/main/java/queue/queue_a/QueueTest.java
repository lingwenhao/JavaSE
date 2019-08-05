package queue.queue_a;


/**
 * 测试队列
 *
 * @author ronin
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        //添加数据
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("-----------------------------------");
        //查看队列头元素
        System.out.println("当前队列头:"+queue.peek());

        System.out.println("-----------------------------------");
        //出队列
        System.out.println("出队列前队列头:"+queue.pool()+"\t执行出队列头操作->");
        System.out.println("出队列前队列头:"+queue.pool()+"\t执行出队列头操作->");
        System.out.println("出队列前队列头:"+queue.pool()+"\t执行出队列头操作->");
        //System.out.println("出队列前队列头:"+queue.pool()+"\t执行出队列头操作->");
        //queue.add(4);
    }
}
