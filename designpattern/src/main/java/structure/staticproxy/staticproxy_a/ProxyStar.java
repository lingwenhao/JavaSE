package structure.staticproxy.staticproxy_a;

/**  
 * 歌手的代理人:除了不能唱歌，其他的什么事儿都可以做
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class ProxyStar implements Star {

	private RealStar realStar;
	
	/**  
	 * 创建一个新的实例 ProxyStar.  
	 *  
	 * @param realStar  
	 */ 
	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}

	/**
	 * <p>Title: confer</p>  
	 * <p>Description: </p>    
	 * @see Star#confer()
	 */

	@Override
	public void confer() {
		System.out.println("ProxyStar(周杰伦经纪人)......confer()");
	}

	/**
	 * <p>Title: signContract</p>  
	 * <p>Description: </p>    
	 * @see Star#signContract()
	 */

	@Override
	public void signContract() {
		System.out.println("ProxyStar(周杰伦经纪人)......signContract()");
	}

	/**
	 * <p>Title: bookTicket</p>  
	 * <p>Description: </p>    
	 * @see Star#bookTicket()
	 */

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar(周杰伦经纪人)......bookTicket()");
	}

	/**
	 * <p>Title: sing</p>  
	 * <p>Description: 唱歌需要调用真实歌手的sing()方法</p>    
	 * @see Star#sing()
	 */

	@Override
	public void sing() {
		realStar.sing();
	}

	/**
	 * <p>Title: clollectMoney</p>  
	 * <p>Description: </p>    
	 * @see Star#clollectMoney()
	 */

	@Override
	public void clollectMoney() {
		System.out.println("ProxyStar(周杰伦经纪人)......clollectMoney()");
	}

}
