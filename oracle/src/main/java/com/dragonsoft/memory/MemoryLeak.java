package com.dragonsoft.memory;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * @author ronin
 * @version V1.0
 * @desc    /内存泄漏
 * @since 2019/7/23 15:54
 */
public class MemoryLeak {
    public static void main(String[] args) {
        testCollectRemove();
    }
    /**
     * 容易导致内存泄漏的集中情况:长生命周期的对象持有短声明周期对象的引用
     */

    /**
     * 1、静态集合类引起内存泄露：
     *      解决方案:使用完后把静态集合的引用指向null，如: vector = null;
     */
    private static Vector vector = new Vector(10);
    public static void fun1(){
        for(int i=1;i<100;i++){
            Object object = new Object();
            vector.add(object);
            //使用完该对象后将引用置为空
            object = null;
        }
    }


    /**
     * 2、当集合里面的对象属性被修改后，再调用remove（）方法时不起作用。
     *      此测试必须在重写Person实体的hashCode()和equals()方法前提下才能模拟出执行remove()无效的情况
     */
    public static void testCollectRemove(){
        Set<Person> set = new HashSet<Person>();
        Person p1 = new Person("唐僧","pwd1",25);
        Person p2 = new Person("孙悟空","pwd2",26);
        Person p3 = new Person("猪八戒","pwd3",27);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //结果：总共有:3 个元素!
        System.out.println("总共有:"+set.size()+" 个元素!");
        //修改p3的年龄,此时p3元素对应的hashcode值发生改变
        System.out.println("hashcode:"+p3.hashCode());
        p3.setAge(2);
        //此时remove不掉，造成内存泄漏
        System.out.println("hashcode:"+p3.hashCode());
        set.remove(p3);
        //重新添加，居然添加成功
        set.add(p3);
        //结果：总共有:4 个元素!
        System.out.println("总共有:"+set.size()+" 个元素!");
        for (Person person : set){
            System.out.println(person);
        }
    }
}

    /**
     * 3、监听器
     * 在java 编程中，我们都需要和监听器打交道，通常一个应用当中会用到很多监听器，我们会调用一个控件的诸
     * 如addXXXListener()等方法来增加监听器，但往往在释放对象的时候却没有记住去删除这些监听器，从而增
     * 加了内存泄漏的机会。
     */

    /**
     * 4、各种连接
     * 比如数据库连接（dataSourse.getConnection()），网络连接(socket)和io连接，除非其显式的调用了
     * 其close（）方法将其连接关闭，否则是不会自动被GC 回收的。对于Resultset 和Statement 对象可以不
     * 进行显式回收，但Connection 一定要显式回收，因为Connection 在任何时候都无法自动回收，而Connection一旦
     * 回收，Resultset 和Statement 对象就会立即为NULL。但是如果使用连接池，情况就不一样了，除了要显式地关闭
     * 连接，还必须显式地关闭Resultset Statement 对象（关闭其中一个，另外一个也会关闭），否则就会造成大量
     * 的Statement 对象无法释放，从而引起内存泄漏。这种情况下一般都会在try里面去的连接，在finally里面释放连接。
     */

    /**
     * 5.单例模式
     *      如果单例对象持有外部对象的引用，那么这个外部对象将不能被jvm正常回收，导致内存泄露。
     *
     */
    class A{
        public A(){
            B.getInstance().setA(this);
        }
    }
    //B类采用单例模式
    class B{
        private A a;
        private static B instance=new B();
        public B(){}
        public static B getInstance(){
            return instance;
        }
        public void setA(A a){
            this.a=a;
        }
    //getter...
    }


class Person{
    private String name;
    private String pwd;
    private Integer age;

    public Person(String name, String pwd, Integer age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getPwd() != null ? !getPwd().equals(person.getPwd()) : person.getPwd() != null) return false;
        return getAge() != null ? getAge().equals(person.getAge()) : person.getAge() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPwd() != null ? getPwd().hashCode() : 0);
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }
}