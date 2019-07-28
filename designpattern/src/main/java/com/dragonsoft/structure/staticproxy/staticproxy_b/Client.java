package com.dragonsoft.structure.staticproxy.staticproxy_b;

public class Client {
    public static void main(String[] args) {
        //创建被对象
        ITeacher teacherDao = new TeacherDao();
        //创建代理对象
        ITeacher teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
