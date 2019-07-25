package com.dragonsoft.thread.create.trhead;

public class SellTicket1 extends Thread{
    private static int tiket = 100;
    @Override
    public void run() {
        while (tiket > 0) {
            System.out.println(Thread.currentThread().getName()+"正在出售第"+tiket--+"张票");
        }
    }
}
