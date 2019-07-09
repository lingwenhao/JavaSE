/**  
* @Title: SingletonEnum.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton.signleton_a;

/**  
* @ClassName: SingletonEnum  
* @Description: TODO(枚举式单例)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public enum SingletonEnum {
	/**
	 * 枚举实现单例模式
	 * 优点:
	 *      1.实现简单
	 *      2.枚举本身就是单例模式,由JVM从根本上提供保障！避免通过反射和反序列化的漏洞
	 *      反射漏洞:即使构造方法私有化，依然可以通过反射创建对象
	 * 缺点:
	 *      1.无延迟加载(没有lazy-load机制)
	 */
	 //这个枚举元素，本身就是单例对象
     INSTANCE;
    //添加自己需要的操作
    public void SingletonOperation(){

    }
}
