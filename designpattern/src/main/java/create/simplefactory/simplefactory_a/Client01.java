/**  
 * @author ronin
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package create.simplefactory.simplefactory_a;

/**  
 * 调用者1:不使用工厂模式
 * @author ronin  
 * @date 2019年3月10日  
 */
public class Client01 {
	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.run();
		
		Byd byd = new Byd();
		byd.run();
	}
}
