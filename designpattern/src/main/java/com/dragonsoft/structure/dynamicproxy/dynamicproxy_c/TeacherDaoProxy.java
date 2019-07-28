package com.dragonsoft.structure.dynamicproxy.dynamicproxy_c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy implements InvocationHandler{
    private Object target;

    public TeacherDaoProxy(Object target) {
        this.target = target;
    }

    public ITeacher getInstance() throws Exception{
        return (ITeacher)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invok = null;
        System.out.println("JDK代理开始......");
        invok = method.invoke(this.target,args);
        System.out.println("JDK代理结束......");
        return invok;
    }

}
