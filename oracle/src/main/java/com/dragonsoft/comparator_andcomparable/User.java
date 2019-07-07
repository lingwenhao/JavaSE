package com.dragonsoft.comparator_andcomparable;

/**
 * @author ronin
 * @version V1.0
 * @description
 * @class User
 * @date 2019/6/27 10:03
 */
public class User {
    private String name;
    private Integer age;

    public User(){

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
