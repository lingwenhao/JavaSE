/**  
 * @Title: AnnoReflect.java  
 * @Package com.dragonsoft.anno  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月14日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**  
 * @ClassName: AnnoReflect  
 * @Description: TODO(反射应用在注解上)  
 * @author ronin  
 * @date 2019年3月14日  
 */
@MyAnno2(name="zhangsan",age=20,sex="nv")
public class AnnoReflect {
	
	@MyAnno2(name="lisi",age=30,sex="nan")
	private String filed;
	
	@MyAnno2(name="wangwu",age=40,sex="nan")
	@MyAnno3(name="zhaoliu",age=50)
	public void eat() {
		
	}
	
	/**
	 * 反射应用在注解上:
	 * 		1.注解的保留策略必须是RUNTIME
	 * 		2.反射注解需要从作用目标上返回
	 * 			类上的注解:需要使用Class来获取
	 * 			方法上的注解:需要使用Method来获取
	 * 			构造器上的注解:需要使用Contrucator来获取
	 * 			成员上的注解:需要使用Filed来获取
	 *  	Class
  	 *			Method、Constructor、Field 的父类:AccessibleObject
  	 *		它们都有一个方法：
  	 * 			Annotation getAnnotation(Class)，返回目标上指定类型的注解！
  	 * 			Annotation[] getAnnotations()，返回目标上所有注解！
	 */
	
	/**
	 * @Title: fun1  
	 * @Description: TODO(使用反射读取类上的注解/单个注解)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1(){
		/**
		 * 1.获取注解的作用目标
		 */
		Class<? extends Object> clazz =  AnnoReflect.class;
		/**
		 * 2.获取指定的注解类型(得到注解对象)
		 */
		MyAnno2 myAnno2 = clazz.getAnnotation(MyAnno2.class);
		/**
		 * 3.
		 */
		System.out.println(myAnno2.name()+"---"+myAnno2.age()+"---"+myAnno2.sex());
	}
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @Title: fun2  
	 * @Description: TODO(使用反射读取属性上的注解/单个注解)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2() throws NoSuchFieldException, SecurityException {
		/**
		 * 1.获取注解的作用目标
		 */
		Class<? extends Object> clazz =  AnnoReflect.class;
		Field field = clazz.getDeclaredField("filed");
		System.out.println(field);
		/**
		 * 2.获取指定的注解类型(得到注解对象)
		 */
		MyAnno2 myAnno2 = field.getAnnotation(MyAnno2.class);
		/**
		 * 3.
		 */
		System.out.println(myAnno2.name()+"---"+myAnno2.age()+"---"+myAnno2.sex());
	}
	
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @Title: fun3  
	 * @Description: TODO(使用反射读取方法上的注解/单个注解)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3() throws NoSuchMethodException, SecurityException{
		/**
		 * 1.获取注解的作用目标
		 */
		Class<? extends Object> clazz =  AnnoReflect.class;
		Method method = clazz.getMethod("eat");
		/**
		 * 2.获取指定的注解类型(得到注解对象)
		 */
		MyAnno2 myAnno2 = method.getAnnotation(MyAnno2.class);
		/**
		 * 3.
		 */
		System.out.println(myAnno2.name()+"---"+myAnno2.age()+"---"+myAnno2.sex());
	}
	
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @Title: fun3  
	 * @Description: TODO(使用反射读取方法上的注解/多个注解)  
	 * @return void
	 * @throws
	 */
	@Test
	public void fun4() throws NoSuchMethodException, SecurityException{
		/**
		 * 1.获取注解的作用目标
		 */
		Class<? extends Object> clazz =  AnnoReflect.class;
		Method method = clazz.getMethod("eat");
		/**
		 * 2.获取指定的注解类型(得到注解对象)
		 */
		Annotation[] annotations = method.getAnnotations();
		for(Annotation annotation:annotations){
			Class<? extends Annotation> annotationType = annotation.annotationType();
		}
		
	}
}


@Retention(RetentionPolicy.RUNTIME)//加了这个元注解才可以使用反射操作注解
@interface MyAnno2 {
	String name();
	int age();
	String sex();
}

@Retention(RetentionPolicy.RUNTIME)//加了这个元注解才可以使用反射操作注解
@interface MyAnno3 {
	String name();
	int age();
}