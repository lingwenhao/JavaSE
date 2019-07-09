/**  
 * @Title: CarFactory.java  
 * @Package com.dragonsoft.create.abstractfactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.abstractfactory.abstractfactory_a;

/**  
 * @ClassName: CarFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
