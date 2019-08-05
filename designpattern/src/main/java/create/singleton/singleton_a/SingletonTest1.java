package create.singleton.singleton_a;

/**  
* @ClassName: SingletonTest1
* @Description: 饿汉式:静态方法
* @author ronin
* @date 2019年3月2日  
*/

public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
class Singleton1 {
    private Singleton1(){

    }
    /**
     * 饿汉式：线程安全,效率高,但是不能延时加载
     *      巧记:恶汉式,非常饿,上来就吃了
     *      效率高体现在不使用同步
     */
    private static final Singleton1 singleton1 = new Singleton1();
    public static Singleton1 getInstance(){
        return  singleton1;
    }
}
