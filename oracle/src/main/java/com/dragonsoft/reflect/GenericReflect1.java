package com.dragonsoft.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;

/**  
 * 使用反射获取继承/实现 时传递的类型参数
 * 						原理:1.反射操作类，必走无参构造方法
 * 							2.继承环境下，先走父类无参构造，再走子类无参构造)  
 * @author ronin  
 * @date 2019年3月14日  
 *    
 */
public class GenericReflect1 {
	/**
	 * 测试继承环境下代码执行顺序
	 * 		顺序:父类静态代码块儿-->子类静态代码块儿-->父类代码块儿-->父类无参构造
	 * 			-->子类代码块儿-->子类无参构造-->子类有参构造)  
	 * 		多个静态代码块儿:字父类静态代码块按照书写顺序执行，在子类静态代码块儿之前执行
	 * 		多个代码块儿:字父类静态代码块儿执行完成后按照书写顺序执行，在无参构造之前执行
	 * 		注意:子类有无参构造执行顺序与书写顺序无关
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		/**
		 * 测试子类默认调用无参构造执行顺序
		 */
		//BB bb = new BB();
		
		/*
		 * 测试子类默认调用有参构造执行顺序
		 */
		//BB bb1 = new BB("hellowrold!");、
		
		/**
		 * 测试继承时子类信息
		 */
		BBB bbb = new BBB("hellowrold!");
	}
}

class B<T>{
	private static final String ParameterizedType = null;

	{
		System.out.println("我是父类B的代码块儿11111！");
	}
	
	static{
		System.out.println("我是父类B的静态代码块儿11111！");
	}
	{
		System.out.println("我是父类B的代码块儿22222！");
	}
	static{
		System.out.println("我是父类B的静态代码块儿22222！");
	}
	
	public B(){
		/**
		 *  获取子泛型传递的类型变量信息
		 *  JDK API查询Class的API
		 *	Class --> Type getGenericSupperclass()
		 * 	Type --> ParameterizedType，把Type强转成ParameterizedType类型！！！
		 *	ParameterizedType --> 参数化类型 = A<String>
		 *	ParameterizedType：Type[] getActualTypeArguments()，A<String>中的String
		 *  Type[]就是Class[]，我们就得到了类型参数了！
		 */
		/**
		 * 1.获取子类Class
		 */
		Class<? extends Object> clazz = this.getClass();
		System.out.println("-----------------------------");
		/**
		 * new BB();获得BB的Class对象
		 * new BBB();获取BBB的Class对象
		 */
		//System.out.println(clazz.getName());
		
		/**
		 * 2.获取传递给父类的 参数化 类型
		 */
		Type type = clazz.getGenericSuperclass();
		System.out.println("子类传递给父类的参数化类型:"+type);
		ParameterizedType parameterizedType  = (ParameterizedType) type;
		System.out.println("子类传递给父类的参数化类型(强转成ParameterizedType，方便调用方法):"+parameterizedType);
		/**
		 * 3.获取真实 参数化 类型 的数组，因为子类可能传递过来多个参数化类型，如:HashMap<K,V>
		 *	 该数组是一个Class数组
		 */
		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
		System.out.println("*************************************");
		for(Type actualTypeArgument:actualTypeArguments){
			System.out.println(actualTypeArgument);
		}
		System.out.println("*************************************");
		/**
		 * 4.获取Class数组中的指定元素，进行类型转换，如Integer.class
		 */
		Class<? extends Object> class1 = (Class)actualTypeArguments[0];
		/**
		 * 5.根据Class对象获取具体的name(即String类型的该类的全限定名，如:java.lang.Integer)
		 */
		System.out.println(class1);
		System.out.println(class1.getName());
		System.out.println("-----------------------------");
		System.out.println("我是父类B的无参构造，我的泛型类型为在创建对象时由子类传递的类型参数决定！");
	
		/**
		 * 获取子泛型传递的类型变量信息，上面步骤写成一个方法
		 */
		System.out.println("=============================");
		Class c = (Class)(((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		System.out.println(c.getName());
		System.out.println("=============================");
	}
	
	public B(String param){
		System.out.println("我是父类B的有参构造！");
	}
}

/**
 * 类型参数为常量:Stirng
 * @author ronin  
 * @date 2019年3月14日  
 *
 */
class BB extends B<String>{
	{
		System.out.println("我是子类BB的代码块儿！");
	}
	
	static{
		System.out.println("我是子类BB的静态代码块儿！");
	}
	
	public BB(){
		System.out.println("我是子类BB的无参构造，我的泛型类型为String！");
	}
	
	public BB(String param){
		System.out.println("我是子类BB的有参构造！");
	}
}

/**
 * 类型参数为常量:Integer
 * @author ronin  
 * @date 2019年3月14日  
 *
 */
class BBB extends B<Integer>{
	{
		System.out.println("我是子类BBB的代码块儿！");
	}
	
	static{
		System.out.println("我是子类BBB的静态代码块儿！");
	}
	public BBB(){
		System.out.println("我是子类BBB的无参构造，我的泛型类型为Integer！");
	}
	public BBB(String param){
		System.out.println("我是子类BBB的有参构造！");
	}
}

