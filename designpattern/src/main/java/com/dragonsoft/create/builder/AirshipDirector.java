/**  
 * @Title: AirshipDirector.java  
 * @Package com.dragonsoft.create.builder.builder  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.builder;

/**  
 * @ClassName: AirshipDirector  
 * @Description: TODO(AirShip装配者接口)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface AirshipDirector {
	/**
	 * @Title: directAirShip  
	 * @Description: TODO(组装飞船)  
	 * @param 
	 * @return AirShip
	 * @throws
	 */
	AirShip directAirShip();
}
