package create.builder.builder_a;

/**  
 * AirShip构建者接口
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface AirShipBuilder {
	/**
	 * 构建轨道舱
	 * @param
	 * @return OrbitalModule
	 * @throws
	 */
	OrbitalModule buildOrbitalModule();
	
	/**
	 * 构建发动机
	 * @param
	 * @return Engin
	 * @throws
	 */
	Engin buildEngin();
	
	/**
	 * 构建逃逸塔
	 * @param
	 * @return EscapeTower
	 * @throws
	 */
	EscapeTower buildEscapeTower();
}
