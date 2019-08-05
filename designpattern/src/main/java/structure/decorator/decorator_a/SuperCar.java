package structure.decorator.decorator_a;

/**  
 * 装饰器
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
