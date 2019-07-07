/**  
 * @Title: ArrayListStack1.java  
 * @Package com.dragonsoft.line.stack  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月30日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

/**  
 * @ClassName: ArrayList  
 * @Description: TODO(基于ArrayList的栈)  
 * @author ronin  
 * @date 2019年3月30日  
 *    
 */
public class ArrayListStack1<T> {
	public static void main(String[] args) {
		ArrayListStack1<String> listStack = new ArrayListStack1<String>();
		/**
		 * 压栈
		 */
		System.out.println("当前栈中的元素:"+listStack.push("a"));
		System.out.println("当前栈中的元素:"+listStack.push("b"));
		System.out.println("当前栈中的元素:"+listStack.push("c"));
		
		/**
		 * 查看栈顶元素
		 */
		System.out.println("栈顶元素:"+listStack.peek());
		
		/**
		 * 弹栈
		 */
		System.out.println("弹出的栈顶元素:"+listStack.pop());
		System.out.println("弹出的栈顶元素:"+listStack.pop());
		System.out.println("弹出的栈顶元素:"+listStack.pop());
		
		/**
		 * 判断栈是否为空
		 */
		System.out.println("判断当前栈是否为空:"+listStack.isEmpty());
		//System.out.println(listStack.pop());
		
	}

	private List<T> elements;
	
	/**  
	 * 创建一个新的实例 ListStack1.  
	 *    
	 */ 
	public ArrayListStack1() {
		elements = new ArrayList<T>();
	}



	/**
	 * 压栈
	 */
	public T push(T t){
		elements.add(t);
		return t;
	}
	
	/**
	 * 弹栈
	 */
	public T pop(){
		if(elements.isEmpty()){
			throw new RuntimeException("当前栈为空！");
		}
		return elements.remove(elements.size()-1);
	}
	
	/**
	 * 查看栈顶元素
	 */
	public T peek(){
		if(elements.isEmpty()){
			throw new RuntimeException("当前栈为空！");
		}
		return elements.get(elements.size()-1);
	}
	
	/**
	 * 判断当前栈是否为空
	 */
	public boolean isEmpty(){
		return elements.isEmpty();
	}
}
