/**  
 * @Title: Brand.java  
 * @Package com.dragonsoft.structure.bridge
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.bridge.bridge_a;

/**  
 * @ClassName: Brand  
 * @Description: TODO(品牌接口)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Brand {
	void sale();
}

/**
 * @ClassName: Lenovol  
 * @Description: TODO(联想电脑)  
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
 * @ClassName: Dell  
 * @Description: TODO(Dell电脑)  
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