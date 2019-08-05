/**  
 * @author ronin
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package create.builder.builder_a;

/**  
 * 装配Dragon号AirShip
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class DragonAirShipDirector implements AirshipDirector{

	private AirShipBuilder builder;
	
	/**  
	 * 创建一个新的实例 DragonAirShipDirector.  
	 *    
	 */ 
	public DragonAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}


	/**
	 * <p>Title: directAirShip</p>  
	 * <p>Description: 装配Dragon号AirShip</p>  
	 * @return  
	 * @see AirshipDirector#directAirShip()
	 */  
	
	@Override
	public AirShip directAirShip() {
		/**
		 * 获取飞船组件
		 */
		OrbitalModule orbitalModule = builder.buildOrbitalModule();
		Engin engin = builder.buildEngin();
		EscapeTower escapeTower = builder.buildEscapeTower();
		
		/**
		 * 装配飞船
		 */
		AirShip airShip = new AirShip();
		airShip.setOrbitalModule(orbitalModule);
		airShip.setEngin(engin);
		airShip.setEscapeTower(escapeTower);
		
		return airShip;
	}

}
