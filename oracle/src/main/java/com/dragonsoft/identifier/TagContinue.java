package com.dragonsoft.identifier;

/**  
 * 模拟goto:打印101到150之间的质数
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
