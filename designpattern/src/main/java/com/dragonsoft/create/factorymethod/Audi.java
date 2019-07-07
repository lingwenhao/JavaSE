/**  
 * @Title: Audi.java  
 * @Package com.dragonsoft.create.factorymethod  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.factorymethod;


/**  
 * @ClassName: Audi  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class Audi implements Car {

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.create.simplefactory.Car#run()  
	 */

	@Override
	public void run() {
		System.out.println("奥迪在跑...");
	}

}
