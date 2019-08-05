package create.abstractfactory.abstractfactory_a;

/**  
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