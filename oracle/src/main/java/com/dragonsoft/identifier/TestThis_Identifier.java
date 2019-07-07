/**  
 * @Title: TestThis_Identifier.java  
 * @Package com.dragonsoft.identifier  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月10日  
 * @version V1.0  
 */ 
package com.dragonsoft.identifier;

/**  
 * @ClassName: TestThis_Identifier  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年4月10日  
 *    
 */
public class TestThis_Identifier {
	public static void main(String[] args) {
		/**
		 * 测试区分二义性
		 */
		This_Identifier this_Identifier = new This_Identifier();
		this_Identifier.say(5);
		
		/**
		 * 测试调用有参无参方法
		 */
		new This_Identifier(1,2,3);
	}
}
