package com.dragonsoft.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/10 11:38
 */
public class Sheep implements Cloneable{
    //基本类型数据
    private int age;
    //引用类型数据
    private String name;

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

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
