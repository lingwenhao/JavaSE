package create.builder.builder_a;

/**  
 * 客户端
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
