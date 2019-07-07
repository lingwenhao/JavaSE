/**  
 * @Title: TreadBinaryTree.java  
 * @Package com.dragonsoft.line.tree  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月6日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.tree;

/**  
 * @ClassName: TreadBinaryTree  
 * @Description: TODO(线索二叉树)  
 * @author ronin  
 * @date 2019年4月6日  
 *    
 */
public class TreadBinaryTree {
	ThreadNode root;
	//临时存储前驱节点
	ThreadNode preNode = null;

	/**  
	 * 设置根节点  
	 */
	public TreadBinaryTree(ThreadNode root) {
		this.root = root;
	}
	
	//中序线索化二叉树
	public void threadNodes(){
		threadNodes(root);
	}

	/**  
	 * @Title: threadNodes  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param node
	 * @return void
	 * @throws  
	 */
	private void threadNodes(ThreadNode node) {
		//当前节点为null，直接返回
		if(node == null){
			return;
		} 
		//处理左子树
		threadNodes(node.leftNode);
		//处理前驱节点
		if(node.leftNode == null){
			//让当前节点的左指针指向前驱节点
			node.leftNode = preNode;
			//改变当前节点左指针的类型
			node.leftType = 1;
		}
		
		//处理前驱的右节点，如果前驱节点的右指针是null(没有指下右子树)
		if(preNode.rightNode == null) {
			//让前驱节点的右指针指向当前节点
			preNode.rightNode = node;
			//改变前驱节点的右指针类型
			preNode.rightType = 1;                                                                                                                                                                                                                                                                                        
		}
		//每处理一个节点，当前节点是下一个节点的前驱节点
		preNode = node;
		//处理右子树
		threadNodes(node.rightNode);
	}
	
}

class ThreadNode {
	//节点的权
	int value;
	//左儿子
	ThreadNode leftNode;
	//右儿子
	ThreadNode rightNode;
	
	//指针类型
	int leftType;
	int rightType;
	
	public ThreadNode (int value){
		this.value = value;
	}
	
	//设置左儿子
	public void setLeftNode(ThreadNode leftNode){
		this.leftNode = leftNode;
	}
	
	public void setRightNode(ThreadNode rightNode){
		this.rightNode = rightNode;
	}
}
