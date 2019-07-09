/**  
 * @Title: StarHandler.java  
 * @Package com.dragonsoft.structure.dynamicproxy
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.dynamicproxy.dynamicproxy_a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**  
 * @ClassName: StarHandler  
 * @Description: TODO(要代理的类对应的处理器)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class StarHandler implements InvocationHandler {

	private RealStar realStar;
	
	/**  
	 * 创建一个新的实例 StarHandler.  
	 *  
	 * @param realStar  
	 */ 
	public StarHandler(RealStar realStar) {
		super();
		this.realStar = realStar;
	}


	/**
	 * <p>Title: invoke</p>  
	 * <p>Description: </p>  
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable  
	 * @see InvocationHandler#invoke(Object, Method, Object[])
	 */  
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始调用"+method.getName()+"方法....");
		Object object = method.invoke(realStar, args);
		System.out.println("结束调用"+method.getName()+"方法....");
		return object;
	}


}
