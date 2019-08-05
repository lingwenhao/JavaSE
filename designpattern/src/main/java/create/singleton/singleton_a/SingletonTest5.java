package create.singleton.singleton_a;

/**
 *  单例:枚举
 *
 * 枚举实现单例模式
 * 优点:
 *      1.实现简单
 *      2.枚举本身就是单例模式,由JVM从根本上提供保障！避免通过反射和反序列化的漏洞
 *      反射漏洞:即使构造方法私有化，依然可以通过反射创建对象
 * 缺点:
 *      1.无延迟加载(没有lazy-load机制)
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton5 instace1 = Singleton5.INSTACE;
        Singleton5 instace2 = Singleton5.INSTACE;
        System.out.println(instace1 == instace2);
        System.out.println(instace1.hashCode());
        System.out.println(instace2.hashCode());
    }
}

enum Singleton5{
    INSTACE;
}
