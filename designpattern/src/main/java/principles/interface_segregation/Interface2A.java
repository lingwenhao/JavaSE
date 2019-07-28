package principles.interface_segregation;

/**
 * 遵循接口隔离原则
 *      把接口1差分为3个接口
 */
//public interface Interface1 {
//    void operator1();
//    void operator2();
//    void operator3();
//    void operator4();
//    void operator5();
//}
public interface Interface2A {
    void operator1();
}

interface Interface2B {
    void operator2();
    void operator3();
}

interface Interface2C {
    void operator4();
    void operator5();
}

/**
 * A2通过Interface1A,InterfaceC依赖B2类
 */
class A2 {
    public void depend1(Interface2A interface2A){
        interface2A.operator1();
    }
    public void depend2(Interface2B interface2B){
        interface2B.operator2();
    }
    public void depend3(Interface2B interface2B){
        interface2B.operator3();
    }
}

/**
 * C2通过Interface2A,Interface2B依赖D2类
 */
class C2 {
    public void depend1(Interface2A interface2A){
        interface2A.operator1();
    }
    public void depend4(Interface2C interface2C){
        interface2C.operator4();
    }
    public void depend5(Interface2C interface2C){
        interface2C.operator5();
    }
}

class B2 implements Interface2A,Interface2B {
    @Override
    public void operator1() {
        System.out.println("B2实现了操作1...");
    }

    @Override
    public void operator2() {
        System.out.println("B2实现了操作2...");
    }

    @Override
    public void operator3() {
        System.out.println("B2实现了操作3...");
    }
}

class D2 implements Interface2A,Interface2C {
    @Override
    public void operator1() {
        System.out.println("D2实现了操作1...");
    }

    @Override
    public void operator4() {
        System.out.println("D2实现了操作4...");
    }

    @Override
    public void operator5() {
        System.out.println("D2实现了操作5...");
    }
}

