/**  
 * @Title: BydFactory.java  
 * @Package create.factorymethod
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package create.factorymethod.factorymethod_a;

/**  
 * @ClassName: BydFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class BydFactory implements CarFactory{

	/**
	 * <p>Title: createCar</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see CarFactory#createCar()
	 */  
	
	@Override
	public Car createCar() {
		return new Byd();
	}

}
