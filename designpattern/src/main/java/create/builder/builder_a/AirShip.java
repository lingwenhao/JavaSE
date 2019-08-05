package create.builder.builder_a;

/**  
 * @author ronin
 * @date 2019年3月23日  
 *    
 */
public class AirShip {
	private OrbitalModule orbitalModule;
	private Engin engin;
	private EscapeTower escapeTower;
	
	public void lanuch(){
		System.out.println("发射飞船......");
	}
	/**  
	 * 创建一个新的实例 AirShip.  
	 *    
	 */ 
	public AirShip() {
		super();
	}


	/**  
	 * 创建一个新的实例 AirShip.  
	 * @param orbitalModule
	 * @param engin
	 * @param escapeTower  
	 */ 
	public AirShip(OrbitalModule orbitalModule, Engin engin, EscapeTower escapeTower) {
		super();
		this.orbitalModule = orbitalModule;
		this.engin = engin;
		this.escapeTower = escapeTower;
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engin getEngin() {
		return engin;
	}

	public void setEngin(Engin engin) {
		this.engin = engin;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}

/**
 * 轨道舱
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class OrbitalModule {
	private String name;

	/**  
	 * 创建一个新的实例 OrbitalModule.  
	 *  
	 * @param name  
	 */ 
	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "OrbitalModule [name=" + name + "]";
	}
	
}

/**
 * 发动机
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Engin {
	private String name;

	/**  
	 * 创建一个新的实例 Engin.  
	 *  
	 * @param name  
	 */ 
	public Engin(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Engin [name=" + name + "]";
	}
	
}

/**
 * 逃逸塔
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class EscapeTower {
	private String name;

	/**  
	 * 创建一个新的实例 EscapeTower.  
	 *  
	 * @param name  
	 */ 
	public EscapeTower(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "EscapeTower [name=" + name + "]";
	}
	
}