package structure.dynamicproxy.dynamicproxy_a;

/**  
 * 抽象角色:定义代理角色和真实角色的公共对外方法
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Star {
	/*
	 * 面谈
	 */
	void confer();
	
	/*
	 * 签合同
	 */
	void signContract();
	
	/*
	 * 订票
	 */
	void bookTicket();
	
	/*
	 * 唱歌
	 */
	void sing();
	
	/*
	 * 收尾款 
	 */
	void clollectMoney();
}
