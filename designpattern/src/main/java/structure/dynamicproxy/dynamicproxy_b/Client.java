package structure.dynamicproxy.dynamicproxy_b;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        ITeacher proxyInstance = (ITeacher)teacherDaoProxy.getProxyInstance();

        //调用无返回值的方法
        proxyInstance.teach();

        //调用有返回值的方法
        String result = proxyInstance.sayello("tom");
        System.out.println("返回值:"+result);
    }
}
