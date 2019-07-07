/**  
 * @Title: ArrayStack1.java  
 * @Package com.dragonsoft.stack  
 * @Description: TODO(基于数组的栈2.0版)  
 * @author ronin  
 * @date 2019年3月9日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.logging.Logger;

/**  
 * @ClassName: ArrayStack1  
 * @Description: TODO(基于数组的栈2.0版)  
 * @author ronin  
 * @date 2019年3月9日  
 *    
 */
public class ArrayStack1 {
	public static Logger logger = Logger.getLogger("ArrayStack1.class");
	
	public static void main(String[] args) {
		ArrayStack1 arrayStack = new ArrayStack1(1);
		/**
		 * 测试压栈
		 */
		arrayStack.push("1");
		arrayStack.push("2");
		arrayStack.push("3");
		
		/**
		 * 测试弹栈
		 */
		System.out.println("弹出的栈顶元素:"+arrayStack.pop());;
		System.out.println("弹出的栈顶元素:"+arrayStack.pop());;
		System.out.println("弹出的栈顶元素:"+arrayStack.pop());;
	}
	
	/**
	 * 存储元素的数组,声明为Object类型,表示可以存储的数据类型为Object类型
	 */
	private Object[] element;
	
	/**
	 * 栈顶指针
	 */
	private int top;
	
	/**
	 * 栈的容量
	 */
	private int capacity;
	
	/**
	 * 构造一个默认容量为10的栈
	 */
	public ArrayStack1(){
		this.element = new Object[10];
		this.top = -1;
		this.capacity = 10;
	}
	
	/**
	 * 构造一个指定容量的栈
	 */
	public ArrayStack1(int initCapacity){
		if(initCapacity < 0){
			throw new IllegalArgumentException("参数长度不合法异常,当前栈容量:"+initCapacity);
		}
		this.element = new Object[initCapacity];
		this.top = -1;
		this.capacity = initCapacity;
	}
	
	/**
	 * @Title: push  
	 * @Description: TODO(把数据压入栈中)  
	 * @param object
	 * @return Object  返回类型  
	 * @throws
	 */
	public Object push(Object object){
		//判断是否需要扩容
		isGrow(++top);
		element[top] = object;
		return object;
	}

	/**
     * 是否需要扩容，如果需要，则扩大一倍并返回true，不需要则返回false
     * @param minCapacity
     * @return
     */
    public boolean isGrow(int minCapacity){
        int oldCapacity = capacity;
        //如果当前元素压入栈之后总容量大于前面定义的容量，则需要扩容
        if(minCapacity >= oldCapacity){
            //定义扩大之后栈的总容量
            int newCapacity = 0;
            //栈容量扩大两倍(左移一位)看是否超过int类型所表示的最大范围
            if((oldCapacity<<1) - Integer.MAX_VALUE >0){
                newCapacity = Integer.MAX_VALUE;
            }else{
                newCapacity = (oldCapacity<<1);//左移一位，相当于*2
            }
            this.capacity = newCapacity;
            element = Arrays.copyOf(element, capacity);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * @Title: pop  
     * @Description: TODO(弹出栈顶元素)  
     * @return Object
     * @throws
     */
    public Object pop(){
        Object obj = peek();
        remove(top);
        return obj;
    }
     
    /**
     * @Title: peek  
     * @Description: TODO(获取栈顶元素)  
     * @return Object
     * @throws
     */
    public Object peek(){
        if(top == -1){
            throw new EmptyStackException();
        }
        return element[top];
    }
    
    /**
     * @Title: isEmpty  
     * @Description: TODO(判断栈是否为空)  
     * @return boolean
     * @throws
     */
    public boolean isEmpty(){
        return (top == -1);
    }
     
    /**
     * @Title: remove  
     * @Description: TODO(删除栈顶元素)  
     * @param top
     * @return void
     * @throws
     */
    public void remove(int top){
        //栈顶元素置为null
        element[top] = null;
        this.top--;
    }
    
	
}
