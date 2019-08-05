package com.dragonsoft.identifier;

/**  
 * 这里用一句话描述这个类的作用
 * @author ronin  
 * @date 2019年3月12日  
 */
public class Final_Identifier {

	
	/**
	 * final修饰变量的初始化时机:
	 * 		A.被final修饰的变量只能赋值一次
	 * 		B.在构造方法完毕前(非静态的常量) 
	 */
	
	int num1 = 10;
	final int num2 = 100;
	
	/**
	 * 没有被final修饰的全部变量可以不初始化，但是被final修饰的全局变量一定要初始化
	 */
	int num3 ;
	final int num4 ;
	
	public Final_Identifier(){
		num1 = 120;
		//如果要改变被final修饰的num2的值，则会报错
		//num2 = 200;
		num4 = 100;
	}
}
