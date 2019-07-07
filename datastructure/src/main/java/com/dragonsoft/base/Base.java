/**  
 * @Title: Base.java  
 * @Package com.dragonsoft.base  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月9日  
 * @version V1.0  
 */ 
package com.dragonsoft.base;

import org.junit.Test;

/**  
 * @ClassName: Base  
 * @Description: TODO(数据结构基础)  
 * @author ronin  
 * @date 2019年3月9日  
 *    
 */
public class Base {
	/**
	 * @Title: fun1  
	 * @Description: TODO(测试位运算)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		int i = 10;
		/**
		 * i向右移动一位,缩小1倍
		 */
		System.out.println("i向右移动一位:"+(i>>1));
		
		int j = 10;
		/**
		 * j向左移动一位,扩大一倍
		 */
		System.out.println("j向左移动一位:"+(j<<1));
	}
	
	
	/**
	 * @Title: fun2  
	 * @Description: TODO(测试Java格式化输出)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2(){
		System.out.printf("我的名字是：%s，年龄是：%d","张三",20);
	}
}
