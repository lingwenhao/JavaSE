/**  
* @Title: SingletonA.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton;

/**  
* @ClassName: SingletonA  
* @Description: TODO(饿汉式单例模式)  
* @author ronin  
* @date 2019年3月2日  
*/

public class SingletonA {
   /**
	* 饿汉式：线程安全,效率高,但是不能延时加载
	*      巧记:恶汉式,非常饿,上来就吃了
	*      效率高体现在不使用同步
    */
    private SingletonA(){}
    private static SingletonA singletona = new SingletonA();
    public static SingletonA getInstance(){
        return  singletona;
    }
}
