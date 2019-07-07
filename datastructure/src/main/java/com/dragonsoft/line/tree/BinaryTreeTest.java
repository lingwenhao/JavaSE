/**  
 * @Title: BinaryTreeTest.java  
 * @Package com.dragonsoft.line.tree  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月1日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.tree;

/**  
 * @ClassName: BinaryTreeTest  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年4月1日  
 *    
 */
public class BinaryTreeTest {
	public static void main(String[] args) {
		//1.创建一棵树
		BinaryTree tree = new BinaryTree();
		//2.创建一个根节点
		TreeNode root = new TreeNode(1);
		//3.把根节点放在树中
		tree.setRoot(root);
		
		//4.创建一个左节点和一个右节点
		TreeNode leftNode = new TreeNode(2);
		TreeNode rightNode = new TreeNode(3);

		//5.把左右节点设置给根节点
		root.setLeftNode(leftNode);
		root.setRightNode(rightNode);
		
		/**
		 * 6.给左右子节点分别设置子节点
		 */
		leftNode.setLeftNode(new TreeNode(4));
		leftNode.setRightNode(new TreeNode(5));
		
		rightNode.setLeftNode(new TreeNode(6));
		rightNode.setRightNode(new TreeNode(7));
		
		/**
		 * 遍历树
		 */
		//前序遍历
		//tree.frontShow();
		//中序遍历
		//tree.middleShow();
		//后序遍历
		tree.afterShow();
		
		System.out.println("----------------------------------------");
		/**
		 * 前序查找
		 */
		TreeNode treeNode = tree.frontSearch(8);
		System.out.println(treeNode);
		System.out.println("----------------------------------------");
		tree.frontShow();
		tree.delete(1);
		System.out.println("----------------------------------------");
		tree.frontShow();
	}
}
