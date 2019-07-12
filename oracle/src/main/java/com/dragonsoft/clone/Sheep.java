package com.dragonsoft.clone;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ronin
 * @version V1.0
 * @desc
 *      测试浅克隆的用例:
 *      实现克隆需要做两件事:
 *          1.实现Cloneable接口，这个接口中没有任何方法，只是一个标记接口
 *          2.需要重写Object类的clone()方法,调用super().clone()方法实现克隆
 *      浅克隆:复制一个对象的复本
 *          对于基本数据类型,如:int,long,float等:复制值
 *          对于复合数据类型:如数组，复制数组地址
 *          对于对象变量：复制对象的reference
 *      浅克隆深入之克隆一个String类型数据:
 *          相当于1个String内存空间有两个引用，当修改其中的一个值的时候，会新分配
 *          一块内存用来保存新的值，这个引用指向新的内存空间,原来的String因为还存
 *          在指向他的引用，所以不会被回收，这样，虽然是复制的引用，但是修改值的时
 *          候，并没有改变被复制对象的值。
 *
 * @since 2019/7/10 11:38
 */
public class Sheep implements Cloneable{
    /**
     * 测试浅克隆
     */
    @Test
    public void shallowClone() throws Exception{
        //原型羊多利
        Sheep sheep = new Sheep();
        sheep.setAge(8);
        sheep.setName("多利");
        sheep.setSmallShellp(new String[]{"小多利1"});
        System.out.println("克隆前:"+sheep);
        //克隆羊多利
        Sheep cloneSheep = sheep.clone();
        System.out.println(cloneSheep);
        System.out.println(sheep == cloneSheep);
        //修改克隆对象的值
        //修改基本类型数据的值:不会影响原型中该字段的值
        cloneSheep.setAge(89);
        //修改String类型数据的值:不会影响原型中该字段的值
        cloneSheep.setName("你好");
        //修改引用类型数据的值:会影响原型中该字段的值
        String[] sons = cloneSheep.getSmallShellp();
        sons[0] = "克隆小多利1";
        System.out.println("修改引用类型数据后的克隆对象:"+cloneSheep);
        System.out.println("修改引用类型数据后的原对象:"+sheep);
    }

    /**
     * 基本类型数据
     */
    private int age;
    /**
     * String类型数据:修改克隆对象中String类型的属性值，再打印这个值，打印时可以发现这个值已经被修改了
     * 属性是String的情况，String也是一个类， String的表现有的像基本类型，
     * 归根到底就是因为String不可改变，克隆之后俩个引用指向同一个String，但当修改其中的一
     * 个，改的不是String的值，却是新生成一个字符串，让被修改的引用指向新的字符串。外表看
     * 起来就像基本类型一样。
     */
    private String name;

    /**
     * 引用类型的数据
     */
    private String[] smallShellp;

    /**
     * 克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSmallShellp() {
        return smallShellp;
    }

    public void setSmallShellp(String[] smallShellp) {
        this.smallShellp = smallShellp;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", smallShellp=" + Arrays.toString(smallShellp) +
                '}';
    }
}
