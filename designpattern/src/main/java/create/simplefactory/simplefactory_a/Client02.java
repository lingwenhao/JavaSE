package create.simplefactory.simplefactory_a;

/**  
 * 调用者2:使用工厂模式
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class Client02 {
	public static void main(String[] args) {
		Car audi = CarFactory.createCar("audi");
		audi.run();
		Car byd = CarFactory.createCar("byd");
		byd.run();
		System.out.println(Client02.class);
	}
}
