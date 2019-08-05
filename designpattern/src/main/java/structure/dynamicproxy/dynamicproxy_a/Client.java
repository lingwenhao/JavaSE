package structure.dynamicproxy.dynamicproxy_a;

import java.lang.reflect.Proxy;

/**  
 * 客户端:测试动态代理
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
