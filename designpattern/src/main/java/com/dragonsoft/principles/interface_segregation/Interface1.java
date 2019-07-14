package com.dragonsoft.principles.interface_segregation;

/**
 * 不遵守接口依赖原则
 */
public interface Interface1 {
    void operator1();
    void operator2();
    void operator3();
    void operator4();
    void operator5();
}

/**
 * A1通过Interface1依赖B类，但只会用到1、2、3方法
 */
class A1 {
    public void depend1(Interface1 interface1){
        interface1.operator1();
    }
    public void depend2(Interface1 interface1){
        interface1.operator2();
    }
    public void depend3(Interface1 interface1){
        interface1.operator3();
    }
}
/**
 * C1通过Interface1依赖D类，但只会用到1、4、5方法
 */
class C1 {
    public void depend1(Interface1 interface1){
        interface1.operator1();
    }
    public void depend4(Interface1 interface1){
        interface1.operator4();
    }
    public void depend5(Interface1 interface1){
        interface1.operator5();
    }
}
class B1 implements Interface1 {
    @Override
    public void operator1() {
        System.out.println("B1实现了操作1...");
    }

    @Override
    public void operator2() {
        System.out.println("B1实现了操作2...");
    }

    @Override
    public void operator3() {
        System.out.println("B1实现了操作3...");
    }

    @Override
    public void operator4() {
        System.out.println("B1实现了操作4...");
    }

    @Override
    public void operator5() {
        System.out.println("B1实现了操作5...");
    }
}
class D1 implements Interface1 {
    @Override
    public void operator1() {
        System.out.println("D1实现了操作1...");
    }

    @Override
    public void operator2() {
        System.out.println("D1实现了操作2...");
    }

    @Override
    public void operator3() {
        System.out.println("D1实现了操作3...");
    }

    @Override
    public void operator4() {
        System.out.println("D1实现了操作4...");
    }

    @Override
    public void operator5() {
        System.out.println("D1实现了操作5...");
    }
}
