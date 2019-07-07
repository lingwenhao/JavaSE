/**  
 * @Title: Recursion.java  
 * @Package com.dragonsoft.recursion  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月31日  
 * @version V1.0  
 */ 
package com.dragonsoft.recursion;

/**  
 * @ClassName: Recursion  
 * @Description: TODO(递归)  
 * @author ronin  
 * @date 2019年3月31日  
 *    
 */
public class Recursion {
	public static void main(String[] args) {
		print(10);
	}
	
	/**
	 * @Title: print  
	 * @Description: TODO(递归函数 )  
	 * @param @param i
	 * @return void
	 * @throws
	 */
	public static void print(int i){
		if(i > 0) {
			System.out.println(i);
			print(i-1);
		}
	}
}
