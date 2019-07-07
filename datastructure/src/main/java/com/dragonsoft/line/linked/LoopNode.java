/**  
 * @Title: LoopNode.java  
 * @Package com.dragonsoft.line.linked  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月31日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.linked;

/**  
 * @ClassName: LoopNode  
 * @Description: TODO(模拟循环链表:
 * 					1.循环链表的最后一个节点的指针域指向链表的第一个节点
 * 					2.循环链表没有最后一个节点，所以也不需要有判断是否为最后一个节点的方法
 * 					3.当循环链表只有一个节点的时候，下一个节点就是当前节点本身)  
 * @author ronin  
 * @date 2019年3月31日  
 *    
 */
public class LoopNode<T> {
	public static void main(String[] args) {
		//创建节点
		LoopNode<String> node1 = new LoopNode<String>("1");
		LoopNode<String> node2 = new LoopNode<String>("2");
		LoopNode<String> node3 = new LoopNode<String>("3");
		
		//增加节点
		node1.after(node2);
		node2.after(node3);
		System.out.println("Node1的下一个节点中的值:"+node1.next().getData());
		System.out.println("Node2的下一个节点中的值:"+node2.next().getData());
		System.out.println("Node3的下一个节点中的值:"+node3.next().getData());
	}
	
	//节点内容
	private T data;
	//下一个节点
	private LoopNode<T> next = this;
	
	/**  
	 * 创建一个新的实例 Node.  
	 */ 
	public LoopNode(T data) {
		this.data = data;
	}
	
	
//	public void append(Node<T> node){
//		this.next = node;
//	}
	
	/**
	 * @Title: next  
	 * @Description: TODO(获取下一个节点)  
	 * @param
	 * @return Node
	 * @throws
	 */
	public LoopNode<T> next(){
		return  this.next;
	}
	
	
	/**
	 * @Title: getData  
	 * @Description: TODO(获取节点中的数据)  
	 * @param @return
	 * @return T
	 * @throws
	 */
	public T getData(){
		return this.data;
	}
	
	
	/**
	 * @Title: removeNext  
	 * @Description: TODO(删除下一个节点)  
	 * @param 
	 * @return void
	 * @throws
	 */
	public void removeNext(){
		System.out.println("删除了"+this.next.getClass().getSimpleName()+this.next.data+"节点!");
		//获取下下一个节点
		LoopNode<T> newNext = next.next;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}
	
	/**
	 * @Title: after  
	 * @Description: TODO(插入一个节点作为当前节点的下一个节点:
	 * 			循环链表中，在当前节点的下一个节点插入数据之前，当前节点的下一个节点始终指向第一个节点)  
	 * @param LoopNode
	 * @return void
	 * @throws
	 */
	public void after(LoopNode<T> node){
		//1.获取到当前节点的下一个节点作为当前节点的下下一个节点
		LoopNode<T> nextNext = this.next;
		System.out.println("当值节点中存放的值:"+this.data);
		System.out.println("当前节点的下一个节点中存放的值:"+this.next.data);
		//2.设置插入的节点作为当前节点的下一个节点
		this.next = node;
		//2.设置插入的节点的下一个节点为当前节点的下下一个节点
		node.next = nextNext;
		
	}

}
