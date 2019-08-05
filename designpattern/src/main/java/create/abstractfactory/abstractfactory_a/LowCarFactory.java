package create.abstractfactory.abstractfactory_a;

/**  
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
		return new LowTyre();
	}

}
