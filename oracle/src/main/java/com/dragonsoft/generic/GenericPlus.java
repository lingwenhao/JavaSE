package com.dragonsoft.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 泛型的继承
 * @author ronin
 * @date 2019年3月14日  
 *    
 */
public class GenericPlus {
	/**
	 * 1.泛型类:具有一个或多个类型变量的类，成为泛型类
	 * 		class A<T> {}
	 * 2.在创建泛型实例时，需要为其类型变量赋值，如果不赋值，会有一个警告
	 * 		A<String> a = new A<String>();
	 * 3.泛型方法:具有一个或者多个类型变量的方法，称为泛型方法
	 * 		class A<T> {
	 * 			public T fun(T t1){}
	 * 		}
	 *  这个fun()方法并不是泛型方法，他是泛型类中的一个方法
	 *		public <T> T fun(T t1){} -->它是泛型方法
	 * 4.泛型在类或方法中的应用:
	 * 		->成员类型
	 * 		->返回值和参数类型
	 * 		->局部变量的引用上
	 * 		class A<T> {
	 *		  	private T bean;//泛型可在成员变量上使用
	 *		  	public T fun(T t) {}//泛型可以在类中的方法上（返回值和参数类型）使用！
	 *		  	public void fun2() {//泛型还可以在局部变量的引用类型上使用
     *		  		T b = ...
     *		  		new T();//不行的！
     *			}
     *		}
     * 5.泛型注意事项:
     * 		1.泛型方法和泛型类没有什么关系，泛型方法不一定要在泛型类中
     * 		2.泛型只作用于编译期，编译成字节码时进行泛型擦除,T类型被替换/擦除成Object类型
	 *		3.JVM虚拟机不检查泛型是否正确
	 */	
	

	/**
	 * 数组不使用泛型的风险
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		Object[] object = new String[10];
		//编译期并不报错，但是运行时报异常
		object[0] = 100;
		
		/**
		 * 编译期就报错，使用时泛型左值和右值的泛型类型必须相同
		 */
		//ArrayList<Object> arrayList = new ArrayList<String>();
	}
	
	
	/**
	 * 泛型的弊端，以及使用通配符解决该问题
	 * 注意事项:通配符只能出现在左边，不能出现在右边/不能在new 时使用)
	 * @throws
	 */
	@Test
	public void fun2(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * 放开注释会报错
		 */
		//print(list);
		
		/**
		 * 泛型通配符:<? extends Object>子类统通配1(导致参数为泛型的方法不可用，返回值为泛型的方法可用)
		 */
		print1(list);
		/**
		 * 泛型通配符:<? extends Integer>子类统通配2(导致参数为泛型的方法不可用，返回值为泛型的方法可用)
		 */
		ArrayList<Integer> integetList = new ArrayList<Integer>();
		ArrayList<Long> longList = new ArrayList<Long>();
		print2(integetList);
		print2(longList);
		
		/**
		 * 泛型通配符:<? super Integer>父类通配(导致返回值为泛型的方法不可用，参数为泛型的方法可用)
		 */
		ArrayList<Number> numbertList = new ArrayList<Number>();
		ArrayList<Short> shortList = new ArrayList<Short>();
		print3(numbertList);
		//print3(shortList);//放开注释报错，参数的只能是Integer的父类
		
		/**
		 * 泛型通配符:无界通配 ?
		 */
		print4(numbertList);
	}
	public void print(List<Object> list){
		System.out.println(list);
	}
	
	/**
	 * 泛型通配符(子类通配)
	 * 			1.?表示一个不确定的值，在调用时确定下来)  
	 * @param list
	 * @return void
	 * @throws
	 */
	public void print1(List<? extends Object> list){
		//list.add("aa");//放开注释报错
		//list.add(11);//放开注释报错
		System.out.println(list);
	}
	
	/**
	 * 泛型通配符(子类通配)
	 * 			1.?表示一个不确定的值，在调用时确定下来)  
	 * @param list
	 * @return void
	 * @throws
	 */
	public void print2(List<? extends Number> list){
		//list.add(22);//放开注释报错
		//list.add(11);//放开注释报错
		
		/**
		 * 可以使用泛型类型接收
		 */
		Number number = list.get(0);
		System.out.println(list);
	}
	
	/**
	 * (泛型通配符(父类通配)
	 * 			1.?表示一个不确定的值，在调用时确定下来)  
	 * @param list
	 * @return void
	 * @throws
	 */
	public void print3(List<? super Integer> list){
		list.add(22);
		list.add(11);
		/**
		 * 接收要用Object类型接收
		 */
		Object object = list.get(0);
		System.out.println(list);
	}
	
	/**
	 * 泛型通配符:(无界匹配)
	 * @param list
	 * @return void
	 * @throws
	 */
	public void print4(List<?> list) {
		/*
		 * 当使用通配符时，对泛型类中的参数为泛型的方法起到了副作用，不能再使用！
		 */
//		list.add("hello");
		/*
		 * 当使用通配符时，泛型类中返回值为泛型的方法，也作废了！，使用Object接收
		 */
		Object s = list.get(0);
		/*
		 * 通配符好处：可以使泛型类型更加通用！尤其是在方法调用时形参使用通配符！
		 */
	}
	
}

