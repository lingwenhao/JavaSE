/**  
 * @Title: PizzaStore.java
 * @Package structure.bridge
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.bridge.bridge_a;


/**  
 * @ClassName: PizzaStore
 * @Description: TODO(测试桥接模式)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		/*
		 * 销售联想笔记本
		 */
		Computer2 lenovolLaptop = new Laptop2(new Lenovol());
		lenovolLaptop.sale();
		
		/*
		 * 销售Dell台式机
		 */
		Computer2 dellDesktop = new Desktop2(new Dell());
		dellDesktop.sale();
	}
}
