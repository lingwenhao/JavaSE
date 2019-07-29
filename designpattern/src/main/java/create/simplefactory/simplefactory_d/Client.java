/**  
 * @Title: Client02.java  
 * @Package com.dragonsoft.create.simplefactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package create.simplefactory.simplefactory_d;


/**
 * @ClassName: Client02  
 * @Description: TODO(调用者2:使用工厂模式)  
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Car audi = CarFactory.createCar(Audi.class);
		audi.run();
		Car byd = CarFactory.createCar(Byd.class);
		byd.run();
	}
}
