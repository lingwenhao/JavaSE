package data_structure.queue.queue_a;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 14:21
 */
public class LinkedListTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.offer("World!");
        queue.offer("你好！");
        System.out.println("queue:"+queue);
        System.out.println("size:"+queue.size());
        String str;
        while((str=queue.poll())!=null){
            System.out.print(str);
        }
        System.out.println();
        System.out.println(queue.size());
    }
}
