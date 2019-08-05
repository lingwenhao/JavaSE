/**  
 * @author ronin
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package create.builder.builder_a;

/**  
 * AirShip装配者接口
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface AirshipDirector {
	/**
	 * 组装飞船
	 * @param 
	 * @return AirShip
	 * @throws
	 */
	AirShip directAirShip();
}
