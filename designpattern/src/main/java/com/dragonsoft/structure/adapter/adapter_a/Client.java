/**  
 * @Title: Client.java  
 * @Package com.dragonsoft.structure.adapter
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.adapter.adapter_a;


/**  
 * @ClassName: Client  
 * @Description: TODO(相当于笔记本电脑，只有USB接口)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public void test(Target t){
		t.handleRequest();
	}
	public static void main(String[] args) {
		/**
		 * 继承实现适配器模式
		 */
		//被适配的对象:对应 键盘
		Adaptee adaptee1 = new Adaptee();
		Target target1 = new Adapter();
		target1.handleRequest();
		
		/**
		 * 组合实现适配器模式
		 */
		Adaptee adaptee2 = new Adaptee();
		Target target2 = new Adapter2(adaptee2);
		target2.handleRequest();
	}
}
