/**  
 * @Title: Client.java  
 * @Package com.dragonsoft.create.builder.builder  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.builder;

/**  
 * @ClassName: Client  
 * @Description: TODO(客户端)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		DragonAirShipDirector dragonAirShipDirector = new DragonAirShipDirector(new DragonAirShipBuilder());
		AirShip airShip = dragonAirShipDirector.directAirShip();
		
		System.out.println(airShip.getOrbitalModule());
		System.out.println(airShip.getEngin());
		System.out.println(airShip.getEscapeTower());
		
		airShip.lanuch();
	}
}
