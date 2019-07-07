/**  
 * @Title: Byd.java  
 * @Package com.dragonsoft.create.simplefactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.simplefactory;

/**  
 * @ClassName: Byd  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class Byd implements Car {

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.create.simplefactory.Car#run()  
	 */

	@Override
	public void run() {
		System.out.println("比亚迪在跑...");
	}

}
