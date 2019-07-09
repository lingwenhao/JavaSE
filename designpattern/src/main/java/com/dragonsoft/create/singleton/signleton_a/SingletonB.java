/**  
* @Title: SingletonB.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton.signleton_a;

/**  
* @ClassName: SingletonB  
* @Description: TODO(懒汉式单例模式)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class SingletonB {
	/**
	 * 懒汉式:线程安全,调用效率不高,但是可以延时加载
	 *      初始的饿汉式是线程不安全的,但是为了保证线程安全,要使用synchronized修饰,但是同步后并发环境下访问效率低下
	 *  巧记:真正用的时候才创建对象(才加载到内存中)
	 */
	private SingletonB(){}
    private static SingletonB singletonB;
    public static SingletonB getInstance(){
        synchronized (SingletonB.class){
            if(singletonB == null){
                singletonB = new SingletonB();
            }
        }
        return singletonB;
    }
}
/**
 * 懒汉同步1:同步方法
 */
//public class SingletonB {
//    private SingletonB(){}
//    private static SingletonB singletonB;
//    public static synchronized SingletonB getInstance(){
//        if(singletonB == null){
//            singletonB = new SingletonB();
//        }
//        return singletonB;
//    }
//}


/**
 * 初始的饿汉式,存在的问题是多线程的情况下不安全,容易发生线程安全问题
 */
//public class SingletonB {
//    private SingletonB(){}
//    private static SingletonB singletonB;
//    public static SingletonB getInstance(){
//        if(singletonB == null){
//            singletonB = new SingletonB();
//        }
//        return singletonB;
//    }
//}
