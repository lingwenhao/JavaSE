/**  
 * @Title: SuperCar.java  
 * @Package com.dragonsoft.structure.decorator
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.decorator.decorator_a;

/**  
 * @ClassName: SuperCar  
 * @Description: TODO(装饰器)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class SuperCar implements ICar {

	private ICar car;
	
	/**  
	 * 创建一个新的实例 SuperCar.  
	 *  
	 * @param car  
	 */ 
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}


	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see ICar#run()
	 */

	@Override
	public void run() {
		car.run();
	}

}
