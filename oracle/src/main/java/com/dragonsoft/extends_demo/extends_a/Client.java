package com.dragonsoft.extends_demo.extends_a;

/**
 * 测试继承时字父类
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 15:52
 */
public class Client {
    public static void main(String[] args) {
        //设置姓名
        Dog dog = new Dog();
        dog.setName();
        System.out.println(dog.getName());
        System.out.println(new Dog().getName());
        System.out.println(new Cat().getName());
    }
}
