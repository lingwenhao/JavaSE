/**  
 * @Title: AirShipBuilder.java  
 * @Package com.dragonsoft.create.builder.builder  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.builder.builder_a;

/**  
 * @ClassName: AirShipBuilder  
 * @Description: TODO(AirShip构建者接口)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface AirShipBuilder {
	/**
	 * @Title: buildOrbitalModule  
	 * @Description: TODO(构建轨道舱)  
	 * @param
	 * @return OrbitalModule
	 * @throws
	 */
	OrbitalModule buildOrbitalModule();
	
	/**
	 * @Title: buildEngin  
	 * @Description: TODO(构建发动机)  
	 * @param
	 * @return Engin
	 * @throws
	 */
	Engin buildEngin();
	
	/**
	 * @Title: buildEscapeTower  
	 * @Description: TODO(构建逃逸塔)  
	 * @param
	 * @return EscapeTower
	 * @throws
	 */
	EscapeTower buildEscapeTower();
}
