package com.dragonsoft.collection;

import org.junit.Test;

import java.util.*;

/**  
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

	/**
	 * 集合装换为数组
	 * 		ArrayList源码注释:c.toArray might (incorrectly) not return Object[] (see 6260652)
	 */
	@Test
	public void toArray(){
		Collection<String> collection = new ArrayList<>();
		collection.add("1");
		collection.add("2");
		collection.add("3");
		Object[] objects = collection.toArray();
		System.out.println(objects.getClass());//class [Ljava.lang.Object;
		System.out.println(Arrays.toString(objects));

		System.out.println("-------------------------");

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		Object[] listArray = list.toArray();
		System.out.println(listArray.getClass());//class [Ljava.lang.String;
		System.out.println(Arrays.toString(listArray));

		System.out.println("-------------------------");

		List<String> arrayList = Arrays.asList("xxx","yyyy");
		Object[] listArray1 = arrayList.toArray();
		System.out.println(listArray1.getClass());//class [Ljava.lang.Object;
		System.out.println(Arrays.toString(listArray1));

	}
}
