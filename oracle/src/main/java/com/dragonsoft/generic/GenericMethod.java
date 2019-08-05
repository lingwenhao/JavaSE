/**  
 * @author ronin
 * @date 2019年3月10日  
 * @version V1.0  
 */ 
package com.dragonsoft.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**  
 * @author ronin
 * @date 2019年3月10日  
 *    
 */
public class GenericMethod {

	public static void main(String[] args) {
		/**
		 * 交换两个整数
		 */
		int[] nums = new int[]{1,2,3,4,5};
		int[] swapNums = swap(nums,0,1);
		System.out.println(Arrays.toString(swapNums));
		
		/**
		 * 交换两个字符串
		 */
		String[] strs = new String[]{"a","b","c","d","e"};
		String[] swapStrs = swap(strs, 0, 1);
		System.out.println(Arrays.toString(strs));
		
		/**
		 * 使用泛型方法：
		 * 		1.定义一个类型，使用大写字母T表示，这个T表示任意的类型
		 * 		2.在返回值void/String/int[]之前写 <T>，表示定义了一个类型，这个类型是T
		 * 		3.在方法参数中使用泛型 T
		 */
		
		//传入一个int类型的数组会报错，泛型必须是一个类型，如:Integer/String/Person等，不能是基本数据类型
		//swapGeneric(nums, 0, 1);
		String[] strsGeneric = new String[]{"a","b","c","d","e"};
		String[] swapGeneric = swapGeneric(strsGeneric, 0, 1);
		System.out.println(Arrays.toString(swapGeneric));
	}
	
	/**
	 * 正确的泛型方法定义格式
	 * @param @param t
	 * @return void
	 * @throws
	 */
	public static <T> void fun1(T t) {

	}
	
	/**
	 * 错误的泛型方法定义格式
	 * @param @param t
	 * @return void
	 * @throws
	 */
//	public static  void fun2(T t) {
//		//报错，编译不通过
//	}
	
	/**
	 * 定义泛型方法:
	 * 		1.格式:
	 * 			修饰符 <类型参数列表> 返回类型 方法名(形参列表) { 方法体 }
	 * 		2.泛型作用域:
	 * 			class A<T> { ... }中T的作用域就是整个A；
	 *			public <T> func(...) { ... }中T的作用域就是方法func
	 *		3.防止类上定义的泛型和方法上定义的泛型冲突:
	 *			class A<T> {
     *				public static <S> void func(S s) {
	 *				
	 *				}
     *			}
     *		4.泛型方法的类型参数可以指定上限:
     *			<T extends X> void func(List<T> list){ ... }，正确
	 *			<T extends X> void func(T t){ ... }，正确
	 *			<T> void func(List<T extends X> list){ ... } ，编译错误
	 *		5.泛型方法/类型通配符
	 *			能用类型通配符（?）解决的问题都能用泛型方法解决，并且泛型方法可以解决的更好
	 *			类型通配符：void func(List<? extends A> list);
	 *			完全可以用泛型方法完美解决：<T extends A> void func(List<T> list);
	 *)  
	 * @param list
	 * @param  map
	 * @return int
	 * @throws
	 */
	public static <T, S> int fun3(List<T> list, Map<Integer, S> map) {
		//其中T和S是泛型类型参数
		return 0;
	}
	
	/**
	 * @param i
	 * @param j
	 * @return T[]
	 * @throws
	 */
	private static <T> T[] swapGeneric(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	/**  
	 * 交换两个字符串
	 * @param strs
	 * @param i
	 * @param j
	 * @return String []
	 * @throws  
	 */
	private static String[] swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
		return strs;
	}
	/**  
	 * 交换两个整数
	 * @param nums
	 * @param i
	 * @param j 参数  
	 * @return int[] 
	 * @throws  
	 */
	private static int[] swap(int[] nums, int i, int j) {
		nums[i] = nums[i] ^ nums[j];
		nums[j] = nums[i] ^ nums[j];
		nums[i] = nums[i] ^ nums[j];
		return nums;
	}
}
