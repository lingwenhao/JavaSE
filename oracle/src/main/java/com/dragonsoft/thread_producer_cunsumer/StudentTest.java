package com.dragonsoft.thread_producer_cunsumer;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        SetThread setThread = new SetThread(student);
        GetThread getThread = new GetThread(student);
        Thread producer = new Thread(setThread, "生产者");
        Thread consumer = new Thread(getThread, "消费者");
        producer.start();
        consumer.start();
    }
}
