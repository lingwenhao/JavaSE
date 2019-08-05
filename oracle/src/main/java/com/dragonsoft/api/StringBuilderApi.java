package com.dragonsoft.api;

/**  
 * String、StringBuffer、StringBuilder区别
 * @author ronin  
 * @date 2019年4月14日  
 *    
 */
public class StringBuilderApi {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("aaaa");
		//stringBuilder.setCharAt(0, '1');
		stringBuilder.insert(0, '1');
		stringBuilder.insert(0, "前驱").insert(0, "链式");
		System.out.println(stringBuilder.toString());
		stringBuilder.delete(0, 1);
		System.out.println(stringBuilder.toString());

		//在编译期会进行优化
		String s1 = "q" + "e";
		String s2 = "1";
		String s3 = "3";
		//编译时期不会做优化，因为编译的时候还不知道s1和s3代表的具体值是什么
		String s4 = s1 + s3;
		System.out.println(s4);
	}
}
