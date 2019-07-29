package structure.dynamicproxy.dynamicproxy_d;

public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();

        //调用无返回值的方法
        proxyInstance.teach();

        //调用有返回值的方法
        String result = proxyInstance.sayello("zhangsan");
        System.out.println("返回值:"+result);

    }
}
