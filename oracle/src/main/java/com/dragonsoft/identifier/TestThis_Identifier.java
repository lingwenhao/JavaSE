package com.dragonsoft.identifier;

/**  
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
