/**  
 * @Title: DoubleLoopNode.java  
 * @Package com.dragonsoft.line.linked  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月31日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.linked;

/**  
 * @ClassName: DoubleLoopNode  
 * @Description: TODO(双向循环链表:
 * 			当只有一个节点的时候，当前节点的下一个节点和上一个节点都是当前节点)  
 * @author ronin  
 * @date 2019年3月31日  
 *    
 */
public class DoubleLoopNode {
	
	public static void main(String[] args) {
		DoubleLoopNode node1 = new DoubleLoopNode(1);
		DoubleLoopNode node2 = new DoubleLoopNode(2);
		DoubleLoopNode node3 = new DoubleLoopNode(3);
		
		/**
		 * 追加节点
		 */
		System.out.println("当前节点中的上一个节点中的数据:"+node1.pre().getData());
		System.out.println("当前节点中的数据:"+node1.getData());
		System.out.println("当前节点中的下一个节点中的数据:"+node1.next().getData());
		node1.after(node2);
		System.out.println("--------------------------------------------------");
		System.out.println("当前节点中的上一个节点中的数据:"+node1.pre().getData());
		System.out.println("当前节点中的数据:"+node1.getData());
		System.out.println("当前节点中的下一个节点中的数据:"+node1.next().getData());
		node2.after(node3);
		System.out.println("--------------------------------------------------");
		System.out.println("当前节点中的上一个节点中的数据:"+node2.pre().getData());
		System.out.println("当前节点中的数据:"+node2.getData());
		System.out.println("当前节点中的下一个节点中的数据:"+node2.next().getData());
		System.out.println("--------------------------------------------------");
		System.out.println("当前节点中的上一个节点中的数据:"+node3.pre().getData());
		System.out.println("当前节点中的数据:"+node3.getData());
		System.out.println("当前节点中的下一个节点中的数据:"+node3.next().getData());
	}
	
	/**
	 * 上一个节点
	 */
	DoubleLoopNode pre = this;
	
	/**
	 * 下一个节点
	 */
	DoubleLoopNode next = this;
	
	/**
	 * 节点数据
	 */
	int data;
	
	/**  
	 * 创建一个新的实例 DoubleLoopNode.  
	 * @param data  
	 */ 
	public DoubleLoopNode(int data) {
		this.data = data;
	}



	/**
	 * @Title: after  
	 * @Description: TODO(增加节点)  
	 * @param DoubleLoopNode
	 * @return void
	 * @throws
	 */
	public void after(DoubleLoopNode node){
		//原来节点的下一个节点
		DoubleLoopNode nextNext = this.next;
		//把新节点作为当前节点的下一个节点
		this.next = node;
		//把当前节点作为新节点的前一个节点
		node.pre =this;
		//将新节点的下一个节点设置为原来节点的下一个节点
		node.next = nextNext;
		//让原来节点的下一个节点为上一个节点的新节点
		nextNext.pre = node;
	}
	
	/**
	 * @Title: next  
	 * @Description: TODO(获取当前节点的下一个节点)  
	 * @param 
	 * @return DoubleLoopNode
	 * @throws
	 */
	public DoubleLoopNode next(){
		return this.next;
	}
	
	
	/**
	 * @Title: pre  
	 * @Description: TODO(获取当前节点的上一个节点)  
	 * @param
	 * @return DoubleLoopNode
	 * @throws
	 */
	public DoubleLoopNode pre(){
		return this.pre;
	}
	
	
	/**
	 * @Title: getData  
	 * @Description: TODO(获取当前节点中的数据)  
	 * @param 
	 * @return int
	 * @throws
	 */
	public int getData(){
		return this.data;
	}
}
