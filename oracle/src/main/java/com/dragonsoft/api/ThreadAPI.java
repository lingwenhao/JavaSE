package com.dragonsoft.api;

import org.junit.Test;

/**
 * Thread类的API
 * @author ronin
 * @date 2019年3月28日  
 *    
 */
public class ThreadAPI {
	/**
	 * 获取当前类的全限定名(有两种方式):适用于非静态方法
	 * @param
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		System.out.println("当前类全限定名:"+this.getClass().getName());
		System.out.println("-----------------------------------------------------");
		StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
		for(StackTraceElement stackTrace:stackTraces) {
			System.out.println(stackTrace);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("当前类全限定名:"+stackTraces[1].getClassName());
		System.out.println("当前文件名:"+stackTraces[1].getFileName());
		System.out.println("当前方法名:"+stackTraces[1].getMethodName());
		System.out.println("当前行号:"+stackTraces[1].getLineNumber());
		System.out.println("stackTraces的代码所在的行号:"+stackTraces[1].getLineNumber());
	}
	
	/**
	 * 获取当前类的全限定名(有一种方式):适用于静态方法
	 * @param
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
		System.out.println("-----------------------------------------------------");
		for(StackTraceElement stackTrace:stackTraces) {
			System.out.println(stackTrace);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("当前类全限定名:"+stackTraces[1].getClassName());
		System.out.println("当前文件名:"+stackTraces[1].getFileName());
		System.out.println("当前方法名:"+stackTraces[1].getMethodName());
		System.out.println("当前行号:"+stackTraces[1].getLineNumber());
		System.out.println("stackTraces的代码所在的行号:"+stackTraces[1].getLineNumber());
	}

}
