package com.dragonsoft.innerclass;

/**
 * 同时内部类实现一个接口
 */
public class InnerClassPlus {
    public static void main(String[] args) {
        new AA().test();
    }
}

interface A{
    void eat();
    void drink();
}
class AA{
    //接口中只有一个方法
//    public void test(){
//        new A(){
//            public void eat(){
//                System.out.println("eat...");
//            }
//        }.eat();
//    }

     //接口中有多个方法
     public void test(){
         A a = new A(){
             public void eat() {
                 System.out.println("eat...");
             }

             public void drink() {
                 System.out.println("drink...");
             }
         };
        a.eat();
        a.drink();
     }
}