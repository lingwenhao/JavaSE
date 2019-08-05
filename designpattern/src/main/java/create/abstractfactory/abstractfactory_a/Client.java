package create.abstractfactory.abstractfactory_a;

/**  
 * 调用者
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class Client {	
	public static void main(String[] args) {
		Engine luxuryCarEngine = new LuxuryCarFactory().createEngine();
		luxuryCarEngine.run();
		Engine lowCarEngine = new LowCarFactory().createEngine();
		lowCarEngine.run();
	}
}
