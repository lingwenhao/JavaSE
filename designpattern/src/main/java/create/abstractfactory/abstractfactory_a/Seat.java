/**  
 * @Title: Seat.java  
 * @Package com.dragonsoft.create.abstractfactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package create.abstractfactory.abstractfactory_a;

/**  
 * @ClassName: Seat  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	/**
	 * <p>Title: massage</p>  
	 * <p>Description: </p>    
	 * @see Seat#massage()
	 */  
	
	@Override
	public void massage() {
		System.out.println("高端座椅有自动按摩功能...");
	}
	
}

class LowSeat implements Seat{

	/**
	 * <p>Title: massage</p>  
	 * <p>Description: </p>    
	 * @see Seat#massage()
	 */  
	
	@Override
	public void massage() {
		System.out.println("低端座椅没有自动按摩的功能...");
	}
}