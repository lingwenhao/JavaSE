/**  
 * @Title: Adapter2.java  
 * @Package com.dragonsoft.structure.adapter
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.adapter.adapter_a;

/**  
 * @ClassName: Adapter2  
 * @Description: TODO(对象适配器方式的适配器:使用组合实现适配器与被适配整合)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Adapter2 implements Target{

	private Adaptee adaptee;
	
	/**  
	 * 创建一个新的实例 Adapter2.  
	 *  
	 * @param adaptee  
	 */ 
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}




	/**
	 * <p>Title: handleRequest</p>  
	 * <p>Description: </p>    
	 * @see Target#handleRequest()
	 */  
	@Override
	public void handleRequest() {
		adaptee.request();
	}

}
