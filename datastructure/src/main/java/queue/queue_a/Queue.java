package queue.queue_a;

import java.util.Arrays;

/**
 * 使用数组模拟队列
 *
 * @author ronin
 */
public class Queue {

    /**队列的最大容量*/
    private int maxCapacity;
    /**队列头指针:指向队列中第一个元素的前一个元素*/
    private int front;
    /**列尾指针:指向队列中的最后一个元素*/
    private int rear;
    /**用于存放队列中的元素*/
    private int[] elements;

    /**
     * 队列中可以存放的最大的元素的个数
     *
     * @param maxCapacity
     */
    public Queue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.front = -1;
        this.rear = -1;
        this.elements = new int[maxCapacity];
        show();
    }

    /**
     * 头指针和尾指针重合时，队列为空
     *
     * @return
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 尾指针指向队列中最后一个元素
     *
     * @return
     */
    public boolean isFull(){
        return rear == maxCapacity - 1;
    }

    /**
     * 往队列尾部加入数据
     *
     * @param n
     */
    public void add(int n){
        if(isFull()){
            throw new IllegalStateException("当前队列已满,无法继续执行入队列操作~");
        }
        elements[++rear] = n;
        show();
    }

    /**
     *  出对列:队列的头指针移动上移
     *
     * @return
     */
    public int pool(){
        show();
        if(isEmpty()){
            throw new IllegalStateException("当前队列中没有元素,无法继续执行出队列操作~");
        }
        return elements[++front];
    }

    /**
     * 返回队列头元素
     *
     * @return
     */
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return elements[0];
    }

    /**
     * 显示队列存储数据
     */
    public void show(){
        if(isEmpty()){
            System.out.println("当前队列中没有元素~"+"\telements:"+Arrays.toString(elements));
            return;
        }
        System.out.print("[队列头指针位置:"+front+"\t队列尾指针位置:"+rear+",elements:"+Arrays.toString(elements)+"]");
        System.out.printf("当前队列中元素:");
        for (int i = front+1; i < rear+1; i++) {
            System.out.printf("%d\t",elements[i]);
        }
        System.out.printf("\n");
    }
}
