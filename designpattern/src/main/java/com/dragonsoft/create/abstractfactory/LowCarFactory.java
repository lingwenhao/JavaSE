/**  
 * @Title: LowCarFactory.java  
 * @Package com.dragonsoft.create.abstractfactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.abstractfactory;

/**  
 * @ClassName: LowCarFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class LowCarFactory implements CarFactory{

	/**
	 * <p>Title: createEngine</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createEngine()
	 */  
	
	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	/**
	 * <p>Title: createSeat</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createSeat()
	 */  
	
	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}

	/**
	 * <p>Title: createTyre</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createTyre()
	 */  
	
	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}

}
