/**  
 * @Title: AudiFactory.java  
 * @Package com.dragonsoft.create.factorymethod  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.factorymethod.factorymethod_a;

/**  
 * @ClassName: AudiFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class AudiFactory implements CarFactory {

	/**
	 * <p>Title: createCar</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createCar()
	 */

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
