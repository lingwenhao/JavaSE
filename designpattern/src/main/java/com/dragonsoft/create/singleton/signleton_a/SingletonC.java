/**  
* @Title: SingletonC.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton.signleton_a;

/**  
* @ClassName: SingletonC  
* @Description: TODO(静态内部类单例)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class SingletonC {
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
	private SingletonC() {}
    private static class SingletonInstance {
        private static  final SingletonC instance = new SingletonC();
    }
    public static SingletonC getInstance(){
        return SingletonInstance.instance;
    }
}
