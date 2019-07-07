/**  
 * @Title: BydFactory.java  
 * @Package com.dragonsoft.create.factorymethod  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.factorymethod;

/**  
 * @ClassName: BydFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class BydFactory implements CarFactory{

	/**
	 * <p>Title: createCar</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.dragonsoft.create.factorymethod.CarFactory#createCar()  
	 */  
	
	@Override
	public Car createCar() {
		return new Byd();
	}

}
