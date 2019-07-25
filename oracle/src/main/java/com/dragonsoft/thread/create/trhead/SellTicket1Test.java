package com.dragonsoft.thread.create.trhead;

public class SellTicket1Test {
    public static void main(String[] args) {
        SellTicket1 s1 = new SellTicket1();
        SellTicket1 s2 = new SellTicket1();
        SellTicket1 s3 = new SellTicket1();
        s1.start();
        s2.start();
        s3.start();
    }
}
