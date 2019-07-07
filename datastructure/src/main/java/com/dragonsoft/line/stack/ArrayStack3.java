/**  
 * @Title: ArrayStack3.java  
 * @Package com.dragonsoft.line.stack  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月30日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.logging.Logger;

/**  
 * @ClassName: ArrayStack3  
 * @Description: TODO(基于数组的栈3.0版:加入了泛型约束)  
 * @author ronin  
 * @date 2019年3月30日  
 *    
 */
public class ArrayStack3<T> {
	private static Logger logger = Logger.getLogger("ArrayStack3.class");

	public static void main(String[] args) {
		ArrayStack3<Integer> stack = new ArrayStack3<Integer>(1);
		/**
		 * 测试压栈
		 */
		stack.push(1);
		stack.printStack();
		stack.push(2);
		stack.printStack();
		stack.push(3);
		stack.printStack();
		
		/**
		 * 测试返回栈顶元素
		 */
		System.out.println("栈顶元素:"+stack.peek());
		
		/**
		 * 测试删除栈顶元素
		 */
		stack.remove();
		stack.printStack();
		System.out.println("--------------");
		/**
		 * 测试弹栈
		 */
		System.out.println("弹出的栈顶元素:"+stack.pop());
		System.out.println("弹出的栈顶元素:"+stack.pop());
		//System.out.println("弹出的栈顶元素:"+stack.pop());
		stack.printStack();
		
		/**
		 * 判断是否为空栈
		 */
		boolean empty = stack.isEmpty();
		System.out.println(empty);
		
	}
	
	/**
	 * 定义一个数组用来存储栈中元素
	 */
	private T[] elements;
	
	/**
	 * 定义栈顶指针
	 */
	private int top;

	/**
	 * 定义栈的容量
	 */
	private int capacity;
	
	/**
	 * 定义栈的初始容量
	 */
	private static final int INITCAPACITY = 10;
	
	/**  
	 * 创建一个新的实例 ArrayStack3.  
	 */ 
	@SuppressWarnings("unchecked")
	public ArrayStack3() {
		this.capacity = INITCAPACITY;
		this.elements = (T[])new Object[INITCAPACITY];
		this.top = -1;
	}

	/**  
	 * 创建一个新的实例 ArrayStack3.  
	 * @param capacity  
	 */ 
	public ArrayStack3(int capacity) {
		if(capacity < 0) {
			throw new RuntimeException("栈的初始大小不能小于0!");
		}
		this.elements = (T[])new Object[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	/**
	 * @Title: push  
	 * @Description: TODO(压栈)  
	 * @param value
	 * @return T
	 * @throws
	 */
	public T push(T value){
		/**
		 * 判断元素入栈之后，栈中元素的总数目会不会超过无参构造函数中设置的栈的容量
		 * 		会超过:尽行扩容操作，然后再执行入栈操作
		 * 		不会超过:直接执行入栈操作
		 */
		isGrow(++top);
		elements[top] = value;
		return value;
	}
	
	/**  
	 * @Title: isGrow  
	 * @Description: TODO(元素入栈之后，栈中元素的总数目会不会超过无参构造函数中设置的栈的容量)  
	 * @param targetCapacity
	 * @return void
	 * @throws  
	 */
	private boolean isGrow(int targetCapacity) {
		int oldCapacity = capacity;
		//目标容量大于等于原来容量,扩容
			/*
			 * 扩容步骤:
			 * 		1.确定新数组容量
			 * 		2.把原数组复制到新数组中
			 * 		3.将原数组的引用指向新数组
			 * 		4.修改类中capacity的值
			 */
		int newCapacity = 0; 
		if(targetCapacity >= oldCapacity) {
			if(capacity<<1 > Integer.MAX_VALUE){
				newCapacity = Integer.MAX_VALUE;
			}else{
				newCapacity = capacity<<1;
			}
			T[] newElements = Arrays.copyOf(elements, newCapacity);
			elements = newElements;
			this.capacity = newCapacity ;
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @Title: peek  
	 * @Description: TODO(弹出栈顶元素)  
	 * @param 
	 * @return T
	 * @throws
	 */
	public T peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return elements[top];
	}
	
	/**
	 * @Title: remove  
	 * @Description: TODO(删除栈顶元素)  
	 * @param
	 * @return T
	 * @throws
	 */
	public void remove(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		T value = elements[top];
		elements[top] = null;
		this.top--;
	}
	
	/**
	 * @Title: pop  
	 * @Description: TODO(测试弹栈)  
	 * @param
	 * @return T
	 * @throws
	 */
	public T pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		T peek = peek();
		remove();
		return peek;
	}
	
	/**
	 * @Title: isEmpty  
	 * @Description: TODO(判断栈是否为空)  
	 * @param
	 * @return boolean
	 * @throws
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	/**
	 * @Title: printStack  
	 * @Description: TODO(打印栈中元素)  
	 * @param 
	 * @return void
	 * @throws
	 */
	public void printStack(){
		if(isEmpty()){
			System.out.println("当前栈为空");
			return;
		}
		System.out.print("当前栈中元素:");
		for(T element:elements){
			if(element == null) {
				/**
				 * return:直接结束方法的执行
				 * break:结束break所在{}这个作用域中的方法执行
				 */
				break;
			}
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
}
