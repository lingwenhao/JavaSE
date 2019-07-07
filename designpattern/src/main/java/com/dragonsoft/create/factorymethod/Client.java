/**  
 * @Title: Client.java  
 * @Package com.dragonsoft.create.factorymethod  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.factorymethod;

/**  
 * @ClassName: Client  
 * @Description: TODO(调用者)  
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
