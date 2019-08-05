/**  
 * @author ronin
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.bridge.bridge_a;
/**
 * 不使用桥接模式:多个维度耦合再一起，使用桥接模式把不同维度之间的耦合解开
 * 		电脑类型是电脑类型:台式机/平板电脑等
 * 		电脑品牌是电脑品牌:Lenovol/Dell等
 * 使用桥接模式:
 * 		使用组合的模式来代替多层继承，以此解除耦合(多重继承也可以解决此问题，不过Java不支持多重继承，值支持多层继承)
 */

/**  
 * 各种电脑的父接口
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Computer {
	void sale();
}

/**
 * 台式机
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Destop implements Computer {

	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Computer#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售台式机......");
	}
}


/**
 * 手提电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Laptop implements Computer {

	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Computer#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售手提电脑......");
	}
}

/**
 * 平板电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Pad implements Computer {

	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Computer#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售平板电脑......");
	}
}


/**
 * 联想台式机
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class LenovolDesktop extends Destop {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Destop#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售联想台式机......");
	}
}

/**
 * 联想手提电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class LenovolLaptop extends Laptop {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Laptop#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售联想手提电脑......");
	}
}

/**
 * 联想平板电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class LenovolPad extends Pad {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Pad#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售联想平板电脑......");
	}
}

/**
 * 神州台式机
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class ShenZhouDesktop extends Destop {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Destop#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售神州台式机......");
	}
}


/**
 * 神州手提电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class ShenZhouLaptop extends Laptop {
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Laptop#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售神州手提电脑......");
	}
}

/**
 * 神州平板电脑
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class ShenZhouPad extends Pad{
	/**
	 * <p>Title: sale</p>  
	 * <p>Description: </p>    
	 * @see Pad#sale()
	 */  
	
	@Override
	public void sale() {
		System.out.println("销售神州平板电脑......");
	}
}