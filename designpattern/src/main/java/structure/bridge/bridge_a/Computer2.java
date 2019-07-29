/**  
 * @Title: Computer2.java  
 * @Package com.dragonsoft.structure.bridge
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.bridge.bridge_a;

/**  
 * @ClassName: Computer2  
 * @Description: TODO(电脑类型的维度)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public abstract class Computer2 {
	protected Brand brand;

	/**  
	 * 创建一个新的实例 Computer2.  
	 *  
	 * @param brand  
	 */ 
	public Computer2(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale(){
		brand.sale();
	}
}

class Desktop2 extends Computer2 {

	/**  
	 * 创建一个新的实例 Desktop2.  
	 *  
	 * @param brand  
	 */ 
	public Desktop2(Brand brand) {
		super(brand);
	}
	
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Computer2#sale()
	 */  
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机......");
	}
}


class Laptop2 extends Computer2 {

	/**  
	 * 创建一个新的实例 Laptop2.  
	 *  
	 * @param brand  
	 */ 
	public Laptop2(Brand brand) {
		super(brand);
	}
	
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Computer2#sale()
	 */  
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售手提电脑......");
	}
}



