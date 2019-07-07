/**  
 * @Title: WarterCar.java  
 * @Package com.dragonsoft.structure.decorator
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.decorator;

/**  
 * @ClassName: WarterCar  
 * @Description: TODO(具体装饰器/具体装饰角色)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class WarterCar extends SuperCar {

	/**  
	 * 创建一个新的实例 WarterCar.  
	 *  
	 * @param car  
	 */ 
	public WarterCar(ICar car) {
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
		swim();
	}

	/**  
	 * @Title: swim  
	 * @Description: TODO(增强的功能)  
	 * @param 
	 * @return void
	 * @throws  
	 */
	private void swim() {
		System.out.println("水里游......");
	}
}
