/**  
 * @Title: ReflectArray.java  
 * @Package com.dragonsoft.reflect  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月28日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;


/**  
 * @ClassName: ReflectArray  
 * @Description: TODO(java.lang.reflect包下Array类)  
 * @author ronin  
 * @date 2019年3月28日  
 *    
 */
public class ReflectArray {
	/**
	 * 数组增强:
	 * 		1.数组对象并不是从某个类实例化而来的，而是JVM动态创建的.
	 * 		2.实例化数组:
	 * 			方法1: Integer[] integers = new Integer[4];
	 *			方法2: Integer[] integers = {1,2,4,5};
	 * 			方法3: 使用反射 Integer[] integers = (Integer[])Array.newInstance(Integer.class,4);
	 *			方法4(componentType是数组类型): 
	 *				//Object array = Array.newInstance(componentType,lenght); 
	 *				Integer nums = new Integer[4];
	 *				Object array = Array.newInstance(nums.getClass().getComponentType(),lenght); 
	 *				
	 */
	

	/**
	 * @throws ClassNotFoundException 
	 * @Title: fun1  
	 * @Description: TODO(使用反射创建数组，并未数组元素赋值/获取数组中元素)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1() throws ClassNotFoundException{
		//创建一个一维String数组
		Class<? extends Object> stringClass = Class.forName("java.lang.String");
		String[] strs = (String[]) Array.newInstance(stringClass,5);
		System.out.println("#给数组元素设置值:");
		for(int i=0; i<strs.length; i++){
			Array.set(strs, i, ("第"+i+"个"));
		}
		
		/**
		 * 这里数组的长度指的是内存空间中分配的长度，不是数组的实际长度
		 */
		System.out.println("#获取数组长度:");
		int length = Array.getLength(strs);
		System.out.println("数组长度:"+length);
		System.out.println(Arrays.toString(strs));
		System.out.println("#获取数组中元素:");
		for(int i=0; i<strs.length; i++){
			String object = (String)Array.get(strs, i);
			System.out.println(object);
		}
		
		System.out.println(Arrays.toString(strs));
	}
	
	/**
	 * @Title: fun2  
	 * @Description: TODO(反射创建数组增强:反射创建数组的两种方式)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2(){
		String[] strs = (String[]) Array.newInstance(String.class, 3);
		System.out.println("#给数组元素设置值:");
		for(int i=0; i<strs.length; i++){
			Array.set(strs, i, ("第"+i+"个"));
		}
		System.out.println("#获取数组中元素:");
		System.out.println(Arrays.toString(strs));
		System.out.println("------------------------------------------");
		
		/**
		 * 下面这种方式也是创建数组，而不是操作数组
		 */
		Integer[] nums = new Integer[4];
		Integer[] its = (Integer[]) Array.newInstance(nums.getClass().getComponentType(), 3);
		System.out.println("#给数组元素设置值:");
		for(int i=0; i<its.length; i++){
			Array.set(its, i, i);
		}
		System.out.println("#获取数组中元素:");
		System.out.println(Arrays.toString(its));//[0, 1, 2]
		System.out.println(Arrays.toString(nums));//[null, null, null, null]
	}
	
	/**
	 * @Title: fun3  
	 * @Description: TODO(通过反射创建Integer类型的数组:并分别通过反射和原始方法对数组元素赋值)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3(){
		//System.out.println(Integer.TYPE);
		Integer[] integers = (Integer[])Array.newInstance(Integer.class, 10);
		for(int i=0;i<integers.length;i++){
			/**
			 * 通过反射为数组元素赋值
			 */
			//Array.set(integers, i, i);
			/**
			 * 通过原始方法为数组元素赋值
			 */
			integers[i] = i;
		}
		System.out.println(Arrays.toString(integers));
	}
	
}
