package structure.staticproxy.staticproxy_a;

/**  
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
