/**  
 * @Title: CarFactory.java  
 * @Package com.dragonsoft.create.simplefactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.simplefactory.simplefactory_a;

/**  
 * @ClassName: CarFactory  
 * @Description: TODO(生产汽车的工厂)  
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class CarFactory {

	/**
	 * @Title: createCar  
	 * @Description: TODO(简单工厂中创建车的方法)  
	 * @param carName
	 * @return Car    返回类型  
	 * @throws
	 */
	public static Car createCar(String carName) {
		if("audi".equals(carName)){
			return new Audi();
		}else if("byd".equals(carName)){
			return new Byd();
		}else{
			return null;
		}
	}
	
}
