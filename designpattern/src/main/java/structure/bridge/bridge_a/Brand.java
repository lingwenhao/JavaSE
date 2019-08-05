package structure.bridge.bridge_a;

/**  
 * 品牌接口
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Brand {
	void sale();
}

/**
 * 联想电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Lenovol implements Brand {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Brand#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售联想电脑...");
	}
}


/**
 * Dell电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Dell implements Brand {

	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Brand#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售Dell电脑......");
	}
	
}