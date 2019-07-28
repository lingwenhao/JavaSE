/**  
 * @Title: Client01.java  
 * @Package create.simplefactory
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package create.simplefactory.simplefactory_a;

/**  
 * @ClassName: Client01  
 * @Description: TODO(调用者1:不使用工厂模式)  
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
