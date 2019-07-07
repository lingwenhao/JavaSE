/**  
 * @Title: TagContinue.java  
 * @Package com.dragonsoft.base  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月10日  
 * @version V1.0  
 */ 
package com.dragonsoft.identifier;

/**  
 * @ClassName: TagContinue  
 * @Description: TODO(模拟goto:打印101到150之间的质数)  
 * @author ronin  
 * @date 2019年4月10日  
 *    
 */
public class TagContinue {
	public static void main(String[] args) {
		outer:for(int i=101; i<150; i++){
			for(int j=2; j<i/2; j++){
				if(i%j == 0){
					continue outer;
				}
			}
			System.out.println(i+" ");
		}
	}
}
