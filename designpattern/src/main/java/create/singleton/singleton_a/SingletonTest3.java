package create.singleton.singleton_a;

/**
 * 饿汉式:线程安全+线程不安全
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singeton3 insance1 = Singeton3.getInsance();
        Singeton3 insance2 = Singeton3.getInsance();
        System.out.println(insance1 == insance2);
        System.out.println(insance1.hashCode());
        System.out.println(insance2.hashCode());
    }
}
class Singeton3{
    private Singeton3(){

    }

    /**
     * 线程不安全
     */
    private static Singeton3 singeton3 = null;
//    public static Singeton3 getInsance(){
//        if(singeton3 == null) {
//            singeton3 =  new Singeton3();
//        }
//        return singeton3;
//    }

    /**
     * 同步方法:线程安全，效率低
     */
//    public static synchronized Singeton3 getInsance(){
//        if(singeton3 == null) {
//            singeton3 =  new Singeton3();
//        }
//        return singeton3;
//    }

    /**
     * 同步代码块:线程安全，效率高
     */
    public static Singeton3 getInsance(){
        synchronized(Singeton3.class){
            if(singeton3 == null) {
                singeton3 =  new Singeton3();
            }
        }
        return singeton3;
    }
}
