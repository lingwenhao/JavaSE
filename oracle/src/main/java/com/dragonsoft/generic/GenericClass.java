package com.dragonsoft.generic;


import org.junit.Test;

/**
 * 泛型使用在类上
 * @author ronin
 * @date 2019年3月10日  
 */
public class GenericClass<T> {
	/**
	 *
	 */
	T aa;
	
	/**
	 * 泛型直接使用在非静态方法上
	 * @param bb
	 * @return void  
	 * @throws
	 */
	public void fun1(T bb){}
	
	/**
	 * 泛型不能直接使用在静态方法 上,需要在方法返回值前面声明
	 * @param cc
	 * @throws
	 */
	//public static void fun2(T cc){}
	
	/**
	 * 泛型使用在静态方法上是，在使用之前要在返回值前声明
	 * @param dd
	 * @return void
	 * @throws
	 */
	public static <T> void fun3(T dd){}

	/**
	 * 测试创建泛型类时调用给泛型参数传递具体的值或者不传递任何具体的值(相当于类上加的泛型废了)
	 *		注意:1.泛型参数的值不能是基本类型
	 *			2.定义了泛型参数，创建对象时不一定要给泛型参数传递实参/给泛型参数赋具体的值	)
	 * @throws
	 */
	@Test
	public void fun4(){
		/**
		 * 给泛型参数传递一个实参:String
		 */
		//创建改对象时，给泛型参数传递具体的值，这里是String类型
		GenericC<String> genericString = new GenericC<String>();
		//该方法返回值为泛型参数传递具体的值,这里是String类型
		String resultString = genericString.getT();
		// 该方法参数为泛型参数传递具体的值,这里是String类型
		String paramString = "aaa";
		genericString.setT(paramString);

		/**
		 * 给泛型参数传递一个实参:Integer
		 */
		//创建改对象时，给泛型参数传递具体的值，这里是Integer类型
		GenericC<Integer> genericInteger = new GenericC<Integer>();
		//该方法返回值为泛型参数传递具体的值,这里是Integer类型
		String resultInteger = genericString.getT();
		//该方法参数为泛型参数传递具体的值,这里是Integer类型
		Integer paramInteger = 123456;
		genericInteger.setT(paramInteger);

		/**
		 * 不给泛型参数传递任何实参
		 */
		//创建改对象时，不给泛型参数传递任何实参
		GenericC genericObject = new GenericC();
		//该方法返回值为泛型参数传递具体的值,这里没有给泛型参数传递任何实参，返回值是Object类型
		Object object = genericObject.getT();
	}

	/**
	 * 泛型的继承: 子类不是泛型类：需要给父类传递类型常量当给父类传递的类型常量为String时，那么在父类中所有T都会被String替换！)
	 * @throws
	 */
	@Test
	public void fun5(){
		/**
		 * 方法参数自动变成Integer类型数据
		 */
		AA aa = new AA();
		aa.fun1(1);

		/**
		 * 方法参数自动变成String类型数据
		 */
		AAA aaa = new AAA();
		aaa.fun1("1");
	}


	/**
	 * 泛型类的继承:子类是泛型类，可以给父类传递类型常量，也可以传递类型变量
	 * @return void
	 * @throws
	 */
	@Test
	public void fun6(){
		/**
		 * 创建对象时确定泛型类型具体是什么类型
		 */
		AAAA<String> aaaa = new AAAA<String>();
		aaaa.fun1("1");
	}
}

/**
 * 实例化泛型类/如果是继承环境，则是实例化泛型类的子类 的时候，需要指定具体的T的类型
 */
class GenericC<T> {

	//这个成员变量的类型为T,T的类型由外部指定
	private T t;

	///方法返回值类型为T，T的类型由外部指定
	public T getT() {
		return t;
	}

	//方法形参key的类型也为T，T的类型由外部指定
	public void setT(T t) {
		this.t = t;
	}
}


class A<T> {
	private T t;

	public T fun1(T t){
		return t;
	}

	private void fun2(T t){
		this.t= t;
	}
}

class AA extends A<Integer> {

}

class AAA extends A<String> {

}
class AAAA<E> extends A<E> {

}