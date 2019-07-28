package com.dragonsoft.action.vistor.vistor_a;

public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.disPlay(success);
        System.out.println("-----------------");
        Fail fail = new Fail();
        //显示测评情况
        objectStructure.disPlay(fail);
    }
}
