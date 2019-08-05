package create.singleton.singleton_a;

/**
 * 静态内部类实现:懒加载模式、线程安全
 * 优点:
 *      1.外部类中没有static属性,不会像饿汉那样立即加载对象
 *      2.只有真正调用getInstance()才会加载静态内部类。加载类时线程是安全
 *          的，instance是static final类型，保证了内存中只有这样一个实
 *         例存在，而且只能被赋值一次，从而保证了线程安全
 *      3.兼备了并发调用和延迟加载的优势
 *          并发体现在:调用的时候可以直接调用
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
class Singleton4 {
    private Singleton4(){

    }
    private static class SingletonInstance {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
