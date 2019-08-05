package com.dragonsoft.enums;

import org.junit.Test;

/**  
 * 枚举API
 * @author ronin
 * @date 2019年3月10日  
 *    
 */
public class EnumApi {
	
	/**
	 * 枚举api
	 * 		name() ：返回枚举的名称
	 * 		ordinal() ：枚举的下标，下标从0开始
	 * 		valueOf(Class<T> enumType, String name) ：得到枚举的对象
	 * 
	 * 还有两个方法，都是这两个方法不在api里面，编译的时候生成两个方法
	 *  	valueof(String name)  转换枚举对象
	 *  	values()  获得所有枚举对象数组
	 */
	
	
	/**
	 * 知道枚举的对象,得到枚举的名称和下标
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		//得到枚举对象
		Color red = Color.RED;
		//得到枚举名称
		String name = red.name();
		System.out.println("枚举名称:"+name);
		//得到枚举下标
		int ordinal = red.ordinal();
		System.out.println("枚举下标:"+ordinal);
	}
	
	/**
	 * 知道枚举的名称,得到枚举的对象和下标
	 * @return void    返回类型
	 * @throws
	 */
	@Test
	public void fun2(){
		//得到枚举名称
		String nameGreen = "GREEN";
		//得到枚举对象，方法一
		Color green = Color.valueOf(nameGreen);
		//得到枚举对象，方法二
		//Color green = Color.valueOf(Color.class, nameGreen);
		//得到下标
		int ordinal = green.ordinal();
		System.out.println("枚举下标:"+ordinal);
	}
	
	/**
	 * 知道枚举下标，得到枚举名称和对象
	 * @return void    返回类型
	 * @throws
	 */
	@Test
	public void fun3(){
		//得到枚举下标
		int idx = 2;
		//根据下标得到枚举对象
			//1.得到枚举数组
		Color[] colors = Color.values();
			//2.根据下标得到对象
		Color yellow = colors[idx];
		
		//得到枚举名称
		System.out.println("枚举名称:"+yellow.name());
	}
}

enum Color{
	RED,GREEN,YELLOW;
}
