/**  
 * @Title: BinaryTree.java  
 * @Package com.dragonsoft.line.tree  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月1日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.tree;


/**  
 * @ClassName: BinaryTree  
 * @Description: TODO(二叉树)  
 * @author ronin  
 * @date 2019年4月1日  
 */
public class BinaryTree {
	
	/**
	 * 二叉树注意事项:，每一个节点由三部分组成，左子节点 数据域 右子节点
	 */
	
	//根节点
	TreeNode root;
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	/**  
	 * @Title: frontShow  
	 * @Description: TODO(前序遍历)  
	 * @return void
	 * @throws  
	 */
	public void frontShow() {
		if(root == null) {
			System.out.println("当前树为空....");
			return;
		}
		root.frontShow();
	}
	
	/**  
	 * @Title: middleShow  
	 * @Description: TODO(中序遍历)  
	 * @return void
	 * @throws  
	 */
	public void middleShow() {
		if(root == null) {
			System.out.println("当前树为空....");
			return;
		}
		root.middleShow();
	}
	
	/**  
	 * @Title: afterShow  
	 * @Description: TODO(后序遍历)  
	 * @return void
	 * @throws  
	 */
	public void afterShow() {
		if(root == null) {
			System.out.println("当前树为空....");
			return;
		}
		root.afterShow();
	}
	
	/**
	 * @Title: frontSearch  
	 * @Description: TODO(前序查找)  
	 * @param i
	 * @return
	 * @return TreeNode
	 * @throws
	 */
	public TreeNode frontSearch(int i){
		return root.frontSearch(i);
	}
	
	/**
	 * @Title: delete  
	 * @Description: TODO(删除一个子树)  
	 * @param i
	 * @return void
	 * @throws
	 */
	public void delete(int i){
		if(root.data == i) {
			root = null;
		}else {
			root.delete(i);
		}
	}
}

class TreeNode {
	//节点的权
	int data;
	
	//左节点
	TreeNode leftNode;
	
	//右节点
	TreeNode rightNode;
	
	/**  
	 * 创建一个新的实例 TreeNode.  
	 */ 
	public TreeNode() {
		
	}
	
	/**  
	 * 创建一个新的实例 TreeNode.  
	 * @param data  
	 */ 
	public TreeNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	/**  
	 * @Title: frontShow  
	 * @Description: TODO(前序)  
	 * @return void
	 * @throws  
	 */
	public void frontShow() {
		//遍历根节点
		System.out.println(data);
		//遍历左子节点
		if(leftNode != null) {
			leftNode.frontShow();
		}
		//遍历右子节点
		if(rightNode != null) {
			rightNode.frontShow();
		}
	}
	
	/**  
	 * @Title: middleShow  
	 * @Description: TODO(中序遍历)  
	 * @return void
	 * @throws  
	 */
	public void middleShow() {
		//遍历左子节点
		if(leftNode != null) {
			leftNode.middleShow();
		}
		//遍历根节点
		System.out.println(data);
		//遍历右子节点
		if(rightNode != null) {
			rightNode.middleShow();
		}
	}
	
	/**  
	 * @Title: afterShow  
	 * @Description: TODO(后序遍历)  
	 * @return void
	 * @throws  
	 */
	public void afterShow() {
		//遍历左子节点
		if(leftNode != null) {
			leftNode.afterShow();
		}
		//遍历右子节点
		if(rightNode != null) {
			rightNode.afterShow();
		}
		//遍历根节点
		System.out.println(data);
	}
	
	/**
	 * 根->左->右
	 * @Title: frontSearch  
	 * @Description: TODO(前序查找)  
	 * @parami
	 * @return TreeNode
	 * @throws
	 */
	public TreeNode frontSearch(int i){
		TreeNode target = null;
		//对比当前节点的值是不是等于目标值，如果等于目标值，则返回当前节点
		if(this.data == i) {
			return this;
		}else{
			//如果当前节点的值不等于目标值，则对比左节点的值是等于目标值
			if(this.leftNode != null){
				target = this.leftNode.frontSearch(i);
			}
			//如果左节点的值等于null，则返回该值，如果不等于目标值，则对比右节点的值是否等于目标值
			if(target != null){
				return target;
			}
			if(this.rightNode != null){
				target = this.rightNode.frontSearch(i);
			}
		}
		return target;
	}
	
	/**
	 * @Title: delete  
	 * @Description: TODO(删除一棵子树)  
	 * @param i
	 * @return void
	 * @throws
	 */
	public void delete(int i){
		TreeNode parent = this;
		//判断左子节点
		if(parent.leftNode !=null && parent.leftNode.data == i) {
			parent.leftNode = null;
			return;
		}
		//判断右子节点
		if(parent.rightNode != null && parent.rightNode.data == i){
			parent.rightNode = null;
			return;
		}
		
		//递归检查并删除左子节点
		parent = leftNode;
		if(parent != null){
			parent.delete(i);
		}
		
		//递归检查并删除右子节点
		parent = rightNode;
		if(parent != null){
			parent.delete(i);
		}
	}
}
