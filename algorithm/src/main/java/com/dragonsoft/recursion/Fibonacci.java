/**  
 * @Title: Fibonacci.java  
 * @Package com.dragonsoft.recursion  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月1日  
 * @version V1.0  
 */ 
package com.dragonsoft.recursion;

/**  
 * @ClassName: Fibonacci  
 * @Description: TODO(递归解决斐波那契数列问题)  
 * @author ronin  
 * @date 2019年4月1日  
 *    
 */
public class Fibonacci {

	public static void main(String[] args) {
		//斐波那契数列:1 1 2 3 5 8 13
		for(int i=1; i<8; i++){
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int i){
		if(i ==1 || i ==2) {
			return 1;
		}else{
			return fibonacci(i-2) + fibonacci(i-1);
		}
	}
}
