/**  
 * @Title: StringAPI.java  
 * @Package com.dragonsoft.api  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**  
 * @ClassName: StringAPI  
 * @Description: TODO(String类高级API)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class StringAPI {
	
	/**
	 * @Title: join  
	 * @Description: TODO(String的Join方法:使用指定的拼接符号把数组/集合中每一个元素拼接起来,拼成一个字符串)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void join(){
		/*
		 * 拼接数组
		 */
		String[] nums = {"123","456","789"};
		String arrayJoinToString = String.join("-",nums);
		System.out.println(arrayJoinToString);
		/*
		 * 拼接集合
		 */
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		String listJoinToString = String.join("+",list);
	}
	
	
	/**
	 * @Title: equalsIgnoreCase  
	 * @Description: TODO(判断两个字符串是否相等，不区分大小写的情况)  
	 * @param
	 * @return String
	 * @throws
	 */
	@Test
	public void equalsIgnoreCase(){
		String s1 = "HELLO";
		String s2 = "hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

	@Test
	public void codePoint(){
		String string = "hello";
		System.out.println("长度:"+string.length());
		System.out.println("实际长度(码点数量)："+string.codePointAt(0));
	}

	/**
	 * split:如果不传入分隔符，则把一个字符串转换为字符数组
	 */
	@Test
	public void split() {
		String source = "abcdef";
		String[] split = source.split("");
		System.out.println(Arrays.toString(split));

	}
}
