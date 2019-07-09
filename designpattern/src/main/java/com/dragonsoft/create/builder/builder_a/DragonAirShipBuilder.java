/**  
 * @Title: DragonAirShipBuilder.java  
 * @Package com.dragonsoft.create.builder.builder  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.builder.builder_a;

/**  
 * @ClassName: DragonAirShipBuilder  
 * @Description: TODO(构建Dragon号发动机)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class DragonAirShipBuilder implements AirShipBuilder{

	/**
	 * <p>Title: buildOrbitalModule</p>  
	 * <p>Description: 构建轨道舱</p>  
	 * @return  
	 * @see AirShipBuilder#buildOrbitalModule()
	 */  
	
	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("构建轨道舱......");
		return new OrbitalModule("Dragon号轨道舱");
	}

	/**
	 * <p>Title: buildEngin</p>  
	 * <p>Description: 构建发动机</p>  
	 * @return  
	 * @see AirShipBuilder#buildEngin()
	 */  
	
	@Override
	public Engin buildEngin() {
		System.out.println("构建发动机......");
		return new Engin("Dragon号发动机");
	}

	/**
	 * <p>Title: buildEscapeTower</p>  
	 * <p>Description: 构建逃逸塔</p>  
	 * @return  
	 * @see AirShipBuilder#buildEscapeTower()
	 */  
	
	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("构建逃逸塔......");
		return new EscapeTower("Dragon号逃逸塔");
	}

}
