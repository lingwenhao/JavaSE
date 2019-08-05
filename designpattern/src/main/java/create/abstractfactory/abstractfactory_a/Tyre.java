package create.abstractfactory.abstractfactory_a;

/**  
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