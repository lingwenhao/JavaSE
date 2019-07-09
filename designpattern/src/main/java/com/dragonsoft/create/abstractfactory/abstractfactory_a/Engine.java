/**  
 * @Title: Engine.java  
 * @Package com.dragonsoft.create.abstractfactory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.create.abstractfactory.abstractfactory_a;

/**  
 * @ClassName: Engine  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public interface Engine {
	void run();
}

class LuxuryEngine implements Engine{

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see Engine#run()
	 */  
	
	@Override
	public void run() {
		System.out.println("高端发动机跑的快...");
	}
	
}

class LowEngine implements Engine{

	/**
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see Engine#run()
	 */  
	
	@Override
	public void run() {
		System.out.println("低端发动机跑的慢...");
	}
	
}