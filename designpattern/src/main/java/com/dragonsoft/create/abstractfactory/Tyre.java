/**  
 * @Title: Tyre.java  
 * @Package com.dragonsoft.create.abstractfactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.abstractfactory;

/**  
 * @ClassName: Tyre  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public interface Tyre {
	void roll();
}

class LuxuryTyre implements Tyre{

	/**
	 * <p>Title: roll</p>  
	 * <p>Description: </p>    
	 * @see Tyre#roll()
	 */  
	
	@Override
	public void roll() {
		System.out.println("高端轮胎轮胎滚动磨损小...");
	}
	
}

class LowTyre implements Tyre {

	/**
	 * <p>Title: roll</p>  
	 * <p>Description: </p>    
	 * @see Tyre#roll()
	 */  
	
	@Override
	public void roll() {
		System.out.println("低端轮胎轮胎滚动磨损大...");
	}
	
}