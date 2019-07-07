/**  
 * @Title: ArrayBinaryTree.java  
 * @Package com.dragonsoft.line.tree  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月3日  
 * @version V1.0  
 */ 
package com.dragonsoft.line.tree;

/**  
 * @ClassName: ArrayBinaryTree  
 * @Description: TODO(顺序存储的二叉树和数组的关系)  
 * @author ronin  
 * @date 2019年4月3日  
 *    
 */
public class ArrayBinaryTree{
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7};
		ArrayBinaryTree tree = new ArrayBinaryTree(data);
		tree.frontShow();
	}
	
	int[] data;

	/**  
	 * 创建一个新的实例 ArrayBinaryTree.  
	 * @param data  
	 */ 
	public ArrayBinaryTree(int[] data){
		super();
		this.data = data;
	}
	
	public void frontShow(){
		this.frontShow(0);
	}
	
	
	/**
	 * @Title: frontShow  
	 * @Description: TODO(前序遍历:根->左->右)  
	 * @param index
	 * @return void
	 * @throws
	 */
	public void frontShow(int index){
		if(data == null || data.length == 0){
			System.out.println("树为空......");
			return;
		}
		//打印根节点(相当于在先遍历根节点)
		System.out.println(data[index]);
		//打印左节点(处理左节点)
		if(2*index+1 < data.length){
			frontShow(2*index+1);
		}
		//打印右节点(处理右节点)
		if(2*index+2 < data.length){
			frontShow(2*index+2);
		}
	}
	
}
