package com.dragonsoft.action.vistor.vistor_a;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手很失败.....");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人给的评价是该歌手很失败.....");
    }
}
