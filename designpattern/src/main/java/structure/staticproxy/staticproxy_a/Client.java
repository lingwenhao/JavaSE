/**  
 * @Title: PizzaStore.java
 * @Package com.dragonsoft.structure.staticproxy
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.staticproxy.staticproxy_a;

/**  
 * @ClassName: PizzaStore
 * @Description: TODO(调用者)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		RealStar realStar = new RealStar();
		ProxyStar proxyStar = new ProxyStar(realStar);
		
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTicket();
		proxyStar.sing();
		proxyStar.clollectMoney();
	}
}