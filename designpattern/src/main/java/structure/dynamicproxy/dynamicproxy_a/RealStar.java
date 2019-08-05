package structure.dynamicproxy.dynamicproxy_a;

/**  
 * 真实的歌手
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class RealStar implements Star {

	/**
	 * <p>Title: confer</p>
	 * <p>Description: </p>
	 * @see structure.staticproxy.staticproxy_a.Star#confer()
	 */

	@Override
	public void confer() {
		System.out.println("RealStar(周杰伦)......confer()");
	}

	/**
	 * <p>Title: signContract</p>  
	 * <p>Description: </p>    
	 * @see structure.staticproxy.staticproxy_a.Star#signContract()
	 */

	@Override
	public void signContract() {
		System.out.println("RealStar(周杰伦)......signContract()");
	}

	/**
	 * <p>Title: bookTicket</p>  
	 * <p>Description: </p>    
	 * @see structure.staticproxy.staticproxy_a.Star#bookTicket()
	 */

	@Override
	public void bookTicket() {
		System.out.println("RealStar(周杰伦)......bookTicket()");
	}

	/**
	 * <p>Title: sing</p>  
	 * <p>Description: </p>    
	 * @see structure.staticproxy.staticproxy_a.Star#sing()
	 */

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦)......sing()");
	}

	/**
	 * <p>Title: clollectMoney</p>  
	 * <p>Description: </p>    
	 * @see structure.staticproxy.staticproxy_a.Star#clollectMoney()
	 */

	@Override
	public void clollectMoney() {
		System.out.println("RealStar(周杰伦)......clollectMoney()");
	}

}
