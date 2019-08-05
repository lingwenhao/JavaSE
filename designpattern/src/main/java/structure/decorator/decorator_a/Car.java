package structure.decorator.decorator_a;

/**  
 * 真实对象
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Car implements ICar {

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see ICar#run()
	 */

	@Override
	public void run() {
		System.out.println("陆地上跑......");
	}

}
