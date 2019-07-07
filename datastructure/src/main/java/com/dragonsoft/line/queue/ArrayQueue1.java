/**  
 * @Title: ArrayQueue1.java  
 * @Package com.dragonsoft.line.queue  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月30日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.queue;


/**  
 * @ClassName: ArrayQueue1  
 * @Description: TODO(基于数组的队列)  
 * @author ronin  
 * @date 2019年3月30日  
 *    
 */
public class ArrayQueue1 {
	public static void main(String[] args) {
		ArrayQueue1 queue = new ArrayQueue1();
		/**
		 * 入队列
		 */
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.printQueue();
		
		/**
		 * 出队列 
		 */
		queue.poll();
		queue.poll();
		queue.poll();
		queue.printQueue();
	}
	
	private int[] elements;

	/**  
	 * 创建一个新的实例 ArrayQueue1.  
	 *    
	 */ 
	public ArrayQueue1() {
		elements = new int[0];
	}
	
	/**
	 * @Title: add  
	 * @Description: TODO(入队列)  
	 * @param value
	 * @return int
	 * @throws
	 */
	public int add(int value){
		/**
		 * 1.创建新数组
		 */
		int[] newArr = new int[elements.length+1];
		/*
		 * 2.把原数组中的值赋值到新数组中
		 */
		for(int i=0; i<elements.length; i++){
			newArr[i] = elements[i];
		}
		newArr[newArr.length-1] = value;
		/*
		 * 3.替换数组
		 */
		elements = newArr;
		return value;
	}
	
	
	/**
	 * @Title: poll  
	 * @Description: TODO(出队列)  
	 * @param @return
	 * @return int
	 * @throws
	 */
	public int poll(){
		/**
		 * 1.获取当前队列中队列头的元素(数组的第0个元素)
		 */
		int value = elements[0];
		/**
		 * 2.创建新的数组，新数组的长度是原数组长度减去1
		 */
		int[] newArr = new int[elements.length-1];
		/**
		 * 3.把原数组的值复制到新数组中
		 */
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = elements[i+1];
		}
		/**
		 * 4.替换数组
		 */
		elements = newArr;
		return value;
	}
	
	/**
	 * @Title: printQueue  
	 * @Description: TODO(出队列)  
	 * @param 
	 * @return void
	 * @throws
	 */
	public void printQueue(){
		/**
		 * 判断队列是不是为空，如果队列为空，抛出异常
		 */
		if(isEmpty()){
			throw new RuntimeException("队列为空，无法执行出队列操作!");
		}
		System.out.print("当前队列中的元素:");
		for(int i=0; i<elements.length; i++){
			System.out.print(elements[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * @Title: isEmpty  
	 * @Description: TODO(判断队列是否为空)  
	 * @param
	 * @return boolean
	 * @throws
	 */
	public boolean isEmpty(){
		return elements.length == 0;
	}
	
}
