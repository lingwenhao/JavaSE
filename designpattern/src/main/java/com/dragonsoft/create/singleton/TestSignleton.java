/**  
* @Title: TestSignleton.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton;

import org.junit.Test;

/**  
* @ClassName: TestSignleton  
* @Description: TODO(测试单例模式)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class TestSignleton {
	/**
     * 测试饿汉式
     * @throws Exception
     */
	@Test
    public void fun1() throws Exception {
        SingletonA instance1 = SingletonA.getInstance();
        SingletonA instance2 = SingletonA.getInstance();
        System.out.println("饿汉单例模式测试结果:"+(instance1 == instance2));
    }
	
    /**
     * 测试懒汉式
     * @throws Exception
     */
	@Test
    public void fun2() throws Exception {
        SingletonB instance1 = SingletonB.getInstance();
        SingletonB instance2 = SingletonB.getInstance();
        System.out.println("懒汉单例模式测试结果:"+(instance1 == instance2));
    }
	
    /**
     * 测试静态内部类单例模式
     * @throws Exception
     */
	@Test
    public void fun3() throws Exception {
        SingletonC instance1 = SingletonC.getInstance();
        SingletonC instance2 = SingletonC.getInstance();
        System.out.println("静态内部类单例模式测试结果:"+(instance1 == instance2));
    }

    /**
     * 测试枚举单例模式
     * @throws Exception
     */
	@Test
    public void fun4() throws Exception {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println("枚举方式单例模式测试结果:"+(instance1 == instance2));
    }
}
