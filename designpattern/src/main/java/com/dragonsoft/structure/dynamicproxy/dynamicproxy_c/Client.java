package com.dragonsoft.structure.dynamicproxy.dynamicproxy_c;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        TeacherDaoProxy iTeacherDaoProxy = new TeacherDaoProxy(teacherDao);
        ITeacher instance = (ITeacher)iTeacherDaoProxy.getInstance();

        //调用无返回值的方法
        instance.teach();

        //调用有返回值的方法
        String result = instance.sayello("tom");
        System.out.println("返回值:"+result);
    }
}
