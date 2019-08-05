package create.factorymethod.factorymethod_a;

/**  
 * @author ronin
 * @date 2019年3月11日  
 *    
 */
public class AudiFactory implements CarFactory {

	/**
	 * <p>Title: createCar</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createCar()
	 */

	@Override
	public Car createCar() {
		return new Audi();
	}

}
