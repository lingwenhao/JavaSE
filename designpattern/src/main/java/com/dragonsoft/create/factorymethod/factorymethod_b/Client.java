package com.dragonsoft.create.factorymethod.factorymethod_b;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //反射创建工厂类
        AddFactory addFactory = AddFactory.class.newInstance();
        Operation add = addFactory.createOperation();
        //反射创建工厂类
        SubFactory subFactory = SubFactory.class.newInstance();
        Operation sub = subFactory.createOperation();
        //反射创建工厂类
        DivFactory divFactory = DivFactory.class.newInstance();
        Operation div = divFactory.createOperation();
        //反射创建工厂类
        MulFactory mulFactory = MulFactory.class.newInstance();
        Operation mul = mulFactory.createOperation();

        System.out.println(add.opertion(1.1,2.0));
        System.out.println(sub.opertion(1.1,2.0));
        System.out.println(div.opertion(1.1,2.0));
        System.out.println(mul.opertion(1.1,2.0));
    }
}
