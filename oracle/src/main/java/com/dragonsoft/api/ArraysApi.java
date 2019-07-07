/**  
 * @Title: ArraysApi.java  
 * @Package com.dragonsoft.api.array  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.api;

import java.util.Arrays;

import org.junit.Test;

/**  
 * @ClassName: ArraysApi  
 * @Description: TODO(数组类的高级API)  
 * @author ronin  
 * @date 2019年3月11日  
 *    
 */
public class ArraysApi {
	
	/**
	 * @Title: join  
	 * @Description: TODO(数组的copyOf()方法，此方法常用来增加数组长度)  
	 * @return void
	 * @throws
	 */
	@Test
	public void copyOf(){
		String[] strs = {"a","b","c","d","e"};
		String[] copyNewShortArray = Arrays.copyOf(strs,1);
		System.out.println("新数组的长度比原数组的长度短:"+Arrays.toString(copyNewShortArray));
		String[] copyNewLongArray = Arrays.copyOf(strs,15);
		System.out.println("新数组的长度比原来数组长度长:"+Arrays.toString(copyNewLongArray));
	}
	
	
	/**
	 * @Title: sort  
	 * @Description: TODO(数组的排序方法，采用优化的快速排序算法(默认从小到大排序))  
	 * @return void
	 * @throws
	 */
	@Test
	public void sort(){
		Integer[] nums = {8,2,5,9,6,3,1};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		Character[] chars = {'b','g','c','d'};
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));
	}
	
	
	/**
	 * @Title: binarySearch  
	 * @Description: TODO(数组的二分查找方法，注意:二分查找前提是数组有序)  
	 * @return void
	 * @throws
	 */
	@Test
	public void binarySearch(){
		Integer[] nums = {1,2,3,5,6,9,10};
		int index = Arrays.binarySearch(nums,3);
		System.out.println(index);
	}
	
	/**
	 * @Title: binarySearchOverload  
	 * @Description: TODO(数组的二分查找方法重载，注意:二分查找前提是数组有序)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void binarySearchOverload(){
		Integer[] nums = {1,2,3,5,6,9,10};
		int index = Arrays.binarySearch(nums,0,2,10);
		System.out.println(index);
	}
	
	/**
	 * @Title: fill  
	 * @Description: TODO(把数组所有的元素的值设置为某个值)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fill(){
		String[] strs = new String[5];
		Arrays.fill(strs,"H");
		System.out.println(Arrays.toString(strs));
		
		Integer[] nums = {1,2,3,4,5};
		Arrays.fill(nums,88);
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @Title: equals  
	 * @Description: TODO(数组的大小相同，对应下标位置的元素也相同，则返回true)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void equals(){
		String[] strs1 = {"1","2","3","4","5"};
		String[] strs2 = {"1","2","3","4","5"};
		String[] strs3 = new String[]{"1","2","3","4","5"};
		System.out.println(Arrays.equals(strs1,strs2));
		System.out.println(Arrays.equals(strs1,strs3));
	}
}
