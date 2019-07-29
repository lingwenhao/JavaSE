package com.dragonsoft.thread.create.runnable;

public class SellTicket2 implements Runnable{
    private static int tiket = 90000;
    private Object object = new Object();
    @Override
    public void run() {
        synchronized (object){
            while (tiket > 0) {
                System.out.println(Thread.currentThread().getName()+"正在出售第"+tiket--+"张票");
            }
        }
    }
}
