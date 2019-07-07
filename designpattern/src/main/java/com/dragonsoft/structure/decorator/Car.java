/**  
 * @Title: Car.java  
 * @Package com.dragonsoft.structure.decorator
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.decorator;

/**  
 * @ClassName: Car  
 * @Description: TODO(真实对象)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Car implements ICar {

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.decorator.ICar#run()
	 */

	@Override
	public void run() {
		System.out.println("陆地上跑......");
	}

}
