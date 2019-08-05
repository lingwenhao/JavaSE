/**  
 * @author ronin
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package create.simplefactory.simplefactory_a;

/**  
 * 生产汽车的工厂
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class CarFactory {

	/**
	 * 简单工厂中创建车的方法
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
