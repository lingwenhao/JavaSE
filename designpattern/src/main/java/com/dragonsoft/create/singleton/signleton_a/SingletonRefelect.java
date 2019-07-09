/**  
* @Title: SingletonRefelect.java  
* @Package com.dragonsoft.create.singleton  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.create.singleton.signleton_a;

/**  
* @ClassName: SingletonRefelect  
* @Description: TODO(使用反射破解单例模式)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class SingletonRefelect {
	private static boolean flag = false;
    private static SingletonRefelect singleton;
    // 类初始化时，不初始化这个对象（延迟加载，真正用的时候再创建）
    private SingletonRefelect(){
        synchronized (SingletonRefelect.class){
            if(false == flag){
                flag = !flag;
            }else {
                throw new RuntimeException("单例模式正在被攻击");
            }

        }

    }
    public static synchronized SingletonRefelect getInstance(){
        if(null == singleton){
            singleton = new SingletonRefelect();
         }
        return singleton;
    }

}
