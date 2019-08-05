package linkedlist.linkedlist_d;

/**  
 * @author ronin
 * @date 2019年3月30日  
 *    
 */
public class Node<T> {
	
	public static void main(String[] args) {
		//创建节点
		Node<String> node1 = new Node<String>("1");
		Node<String> node2 = new Node<String>("2");
		Node<String> node3 = new Node<String>("3");
		
		/**
		 * 简单append():追加节点
		 */
		//node1.append(node2);
		//node2.append(node3);
		
		/**
		 * 复杂append():追加节点
		 */
		node1.append(node2).append(node3);
		
		//获取当前节点数据
		System.out.println(node1.getData());
		//获取当前节点的下一个节点的数据
		System.out.println(node1.next().getData());
		//获取当前节点的下下一个节点的数据
		System.out.println(node1.next().next().getData());
		System.out.println(node1.isLast());
		System.out.println(node2.isLast());
		System.out.println(node3.isLast());

		node1.show();
		/**
		 * 删除当前节点的下一个节点
		 */
		node1.removeNext();
		node1.show();

		/**
		 * 插入一个节点到当前节点的下一个节点
		 */
		node1.after(new Node<String>("新插入的节点^_^!"));
		node1.show();
	}
	
	//节点内容
	private T data;
	//下一个节点
	private Node<T> next;
	
	/**  
	 * 创建一个新的实例 Node.  
	 */ 
	public Node(T data) {
		this.data = data;
	}
	
	/**
	 * 为当前节点追加节点
	 * @param node
	 * @return Node<T>
	 * @throws
	 */
	public Node<T> append(Node<T> node){
		//当前节点(this代表方法调用者本身)
		Node<T> currentNode = this;
		//循环向后查找
		while(true) {
			//取出下一个节点
			Node<T> nextNode = currentNode.next();
			//说明当前节点已经是最后一个节点了
			if(nextNode == null) {
				break;
			}
			//赋值给当前节点
			currentNode = nextNode;
		}
		//把需要追加的节点追加到currentNode这个节点上
		currentNode.next = node;
		return this;
	}
	
//	public void append(Node<T> node){
//		this.next = node;
//	}
	
	/**
	 * 获取下一个节点
	 * @param
	 * @return Node
	 * @throws
	 */
	public Node<T> next(){
		return  this.next;
	}
	
	
	/**
	 * 获取节点中的数据
	 * @param @return
	 * @return T
	 * @throws
	 */
	public T getData(){
		return this.data;
	}
	
	/**
	 * 判断当前节点是不是最后一个节点
	 * @param @return
	 * @return boolean
	 * @throws
	 */
	public boolean isLast(){
		return this.next == null;
	}
	
	
	/**
	 * 删除下一个节点
	 * @param 
	 * @return void
	 * @throws
	 */
	public void removeNext(){
		System.out.println("删除了"+this.next.getClass().getSimpleName()+this.next.data+"节点!");
		//获取下下一个节点
		Node<T> newNext = next.next;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}
	
	/**
	 * 插入一个节点作为当前节点的下一个节点
	 * @param node
	 * @return void
	 * @throws
	 */
	public void after(Node<T> node){
		//1.获取到当前节点的下一个节点作为当前节点的下下一个节点
		Node<T> nextNext = this.next;
		//2.设置插入的节点作为当前节点的下一个节点
		this.next = node;
		//2.设置插入的节点的下一个节点为当前节点的下下一个节点
		node.next = nextNext;
		
	}
	/**
	 * 打印所有节点
	 * @param 
	 * @return void
	 * @throws
	 */
	public void show(){
		System.out.println("------------------------------");
		Node<T> currentNode = this;
		while(true){
			System.out.println(currentNode.getClass().getSimpleName()+currentNode.data+"中的值:"+currentNode.data+"");
			currentNode = currentNode.next;
			//如果是最后一个节点，返回
			if(currentNode == null) {
				break;
			}
		}
		System.out.println("------------------------------");
	}
}
