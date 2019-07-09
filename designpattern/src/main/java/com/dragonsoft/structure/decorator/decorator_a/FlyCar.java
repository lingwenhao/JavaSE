/**  
 * @Title: FlyCar.java  
 * @Package com.dragonsoft.structure.decorator
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.decorator.decorator_a;

/**  
 * @ClassName: FlyCar  
 * @Description: TODO(具体装饰器/具体装饰角色)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class FlyCar extends SuperCar {

	/**  
	 * 创建一个新的实例 FlyCar.  
	 *  
	 * @param car  
	 */ 
	public FlyCar(ICar car) {
		super(car);
	}

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see SuperCar#run()
	 */  
	
	@Override
	public void run() {
		super.run();
		fly();
	}

	/**  
	 * @Title: fly  
	 * @Description: TODO(增强的功能)  
	 * @param 
	 * @return void
	 * @throws  
	 */
	private void fly() {
		System.out.println("天上飞......");
	}
}

