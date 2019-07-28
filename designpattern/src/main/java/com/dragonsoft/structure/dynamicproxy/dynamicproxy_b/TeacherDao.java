package com.dragonsoft.structure.dynamicproxy.dynamicproxy_b;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("授课中......");
    }

    @Override
    public String sayello(String name) {
        System.out.println("hello"+name);
        return name;
    }
}
