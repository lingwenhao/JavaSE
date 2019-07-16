package com.dragonsoft.thread;

public class LockTicketTest {
    public static void main(String[] args) {
        LockTicket lockTicket = new LockTicket();
        Thread t1 = new Thread(lockTicket, "窗口1");
        Thread t2 = new Thread(lockTicket, "窗口2");
        Thread t3 = new Thread(lockTicket, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
