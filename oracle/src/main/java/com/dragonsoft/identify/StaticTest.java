package com.dragonsoft.identify;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/10 13:39
 */
public class StaticTest {
    public static void main(String[] args) {
        //调用eat方法,构造方法并未执行，验证static是和类绑定的，不是和类的实例绑定的
        Demo.eat();
    }
}

class Demo {
    public Demo(){
        System.out.println("Demo Constructors....");
    }
    public static void eat(){
        System.out.println("吃....");
    }
}