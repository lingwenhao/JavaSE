/**  
 * @Title: Client.java  
 * @Package com.dragonsoft.structure.dynamicproxy
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.dynamicproxy;

import java.lang.reflect.Proxy;

/**  
 * @ClassName: Client  
 * @Description: TODO(客户端:测试动态代理)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		RealStar realStar = new RealStar();
		StarHandler starHandler = new StarHandler(realStar);
		Star starProxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, starHandler);
		starProxy.bookTicket();
	}
}
