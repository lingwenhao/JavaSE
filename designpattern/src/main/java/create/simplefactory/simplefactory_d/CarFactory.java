/**  
 * @author ronin
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package create.simplefactory.simplefactory_d;

/**
 * 生产汽车的工厂
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class CarFactory {

	/**
	 * 使用反射增强工厂方法模式
	 * @param clazz
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static Car createCar(Class clazz) throws IllegalAccessException, InstantiationException {
		return (Car) clazz.newInstance();
	}
	
}
