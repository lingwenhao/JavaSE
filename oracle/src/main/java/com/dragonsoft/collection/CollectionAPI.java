/**  
 * @Title: CollectionAPI.java  
 * @Package com.dragonsoft.collection  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月16日  
 * @version V1.0  
 */ 
package com.dragonsoft.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**  
 * @ClassName: CollectionAPI  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年4月16日  
 *    
 */
public class CollectionAPI {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("2");
		list2.add("3");
		list2.add("4");
		System.out.println("list1:"+list1.toString());//list1:[1, 2, 3]
		System.out.println("list2:"+list2.toString());//list2:[2, 3, 4]
		
//		boolean addAll = list1.addAll(list2);
//		System.out.println("list1.addAll(list2) :"+list1.toString());//list1.addAll(list2) :[1, 2, 3, 2, 3, 4]
		
//		boolean removeAll = list1.removeAll(list2);
//		System.out.println("list1.removeAll(list2):"+list1.toString());//list1.removeAll(list2):[1]
		
		/**
		 * 取交集
		 */
//		boolean retainAll = list1.retainAll(list2);
//		System.out.println("list1.retainAll(list2):"+list1.toString());//list1.retainAll(list2):[2, 3]
		
		System.out.println(list1.containsAll(list2));
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("2");
		System.out.println(list1.containsAll(list3));
		
		System.out.println("---------------------------------------------------------------------------");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("1");
		set1.add("2");
		set1.add("3");
		Set<String> set2 = new HashSet<String>();
		set2.add("2");
		set2.add("3");
		set2.add("4");
		
		System.out.println("set1:"+set1.toString());
		System.out.println("set2:"+set2.toString());
		set1.addAll(set2);
		
		/**
		 * 会自动去重
		 */
		System.out.println("set1.addAll(set2):"+set1.toString());
	}

	/**
	 * 判断集合是否为空
	 */
	@Test
	public void isEmptyCollection(){
		Collection<String> collection = new ArrayList<>();
		boolean empty = collection.isEmpty();
		System.out.println(empty);
	}
}
