/**  
 * @Title: ArrayStack2.java  
 * @Package com.dragonsoft.line.stack  
 * @Description: TODO(基于数组的栈1.0版)  
 * @author ronin  
 * @date 2019年3月30日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.stack;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**  
 * @ClassName: ArrayStack2  
 * @Description: TODO(基于数组的栈1.0版)  
 * @author ronin  
 * @date 2019年3月30日  
 */
public class ArrayStack2 {
	
	private static Logger logger = Logger.getLogger("ArrayStack2.class");
	
	public static void main(String[] args) {
		//logger.setLevel(Level.OFF);
		ArrayStack2 arrayStack = new ArrayStack2();
		/**
		 * 测试压栈
		 */
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		
		/**
		 * 测试查看栈顶元素
		 */
		System.out.println("栈顶元素:"+arrayStack.peek());
		/**
		 * 测试弹栈
		 */
		System.out.println("弹出的元素:"+arrayStack.pop());
		System.out.println("栈顶元素:"+arrayStack.peek());
		System.out.println("弹出的元素:"+arrayStack.pop());
		System.out.println("栈顶元素:"+arrayStack.peek());
		System.out.println("弹出的元素:"+arrayStack.pop());
	}
	
	/**
	 * 栈的底层使用数组来存储数据
	 */
	int[] elements;
	
	/**
	 * 创建一个新的实例 ArrayStack2.  
	 */
	public ArrayStack2() {
		elements = new int[0];
	}
	
	/**
	 * @Title: push  
	 * @Description: TODO(压栈:把传入的元素放入新数组最后一个元素的位置，并返回压入栈中的元素)  
	 * @param @param value
	 * @param @return
	 * @return int
	 * @throws
	 */
	public int push(int value){
		logger.info("压栈操作前栈中元素:"+Arrays.toString(elements));
		//1.创建一个新数组，长度为原数组长度+1
		int[] newArr = new int[elements.length+1];
		//2.把原数组的值赋值给新数组
		for(int i=0; i<elements.length; i++){
			newArr[i] = elements[i];
		}
		newArr[newArr.length-1] = value;
		//3.替换数组
		elements = newArr;
		logger.info("压栈操作后栈中的元素:"+Arrays.toString(elements));
		logger.info("压入栈中的元素:"+elements[elements.length-1]);
		return value;
	}

	/**
	 * 弹栈
	 */
	public int pop(){
		/**
		 * 判断是不是空栈,如果是空栈
		 */
		if(isEmpty()){
			throw new RuntimeException("当前栈为空!");
		}
		logger.info("弹栈操作前栈中元素:"+Arrays.toString(elements));
		//1.创建新数组，长度为原数组的长度-1
		int[] newArr = new int[elements.length-1];
		//保存弹出的值
		int popValue = elements[elements.length-1];
		//2.把原数组的值赋值给新数组
		for(int i=0; i<newArr.length; i++){
			newArr[i] = elements[i];
		}
		//3.替换数组
		elements = newArr;
		logger.info("弹栈操作后栈中元素:"+Arrays.toString(elements));
		logger.info("弹出的元素:"+popValue);
		//4.执行弹栈操作
		return popValue;
	}
	
	/**
	 * 判断是不是空栈
	 */
	public boolean isEmpty(){
		return elements.length == 0;
	}
	
	/**
	 * 查看栈顶元素
	 */
	public int peek(){
		/**
		 * 先判断是不是空栈,是空栈直接抛出异常
		 */
		if(isEmpty()){
			throw new RuntimeException("当前栈为空!");
		}
		return elements[elements.length-1];
	}
}
