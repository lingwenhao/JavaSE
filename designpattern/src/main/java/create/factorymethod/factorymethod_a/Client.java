package create.factorymethod.factorymethod_a;

/**  
 * 调用者
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		audi.run();
		
		Car byd = new BydFactory().createCar();
		byd.run();
	}
}
