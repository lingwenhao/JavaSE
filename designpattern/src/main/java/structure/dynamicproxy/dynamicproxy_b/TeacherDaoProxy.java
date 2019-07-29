package structure.dynamicproxy.dynamicproxy_b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy{
    private ITeacher target;

    public TeacherDaoProxy(ITeacher target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke  = null;
                System.out.println("JDK开始代理.......");
                invoke = method.invoke(target,args);
                System.out.println("JDK结束代理.......");
                return invoke;
            }
        });
    }

}
