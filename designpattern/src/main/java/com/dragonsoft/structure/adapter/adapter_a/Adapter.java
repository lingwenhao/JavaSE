/**  
 * @Title: Adapter.java  
 * @Package com.dragonsoft.structure.adapter
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.adapter.adapter_a;

/**  
 * @ClassName: Adapter  
 * @Description: TODO(类适配器方式的适配器:把配适配对象和Targer接口连接起来)  
 * @author ronin  
 * @date 2019年3月23日  
 */
public class Adapter extends Adaptee implements Target{

	/**
	 * <p>Title: handleRequest</p>  
	 * <p>Description: </p>    
	 * @see Target#handleRequest()
	 */  
	
	@Override
	public void handleRequest() {
		super.request();
	}
	
}
