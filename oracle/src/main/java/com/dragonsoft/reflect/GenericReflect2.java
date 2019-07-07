/**  
 * @Title: GenericReflect2.java  
 * @Package com.dragonsoft.reflect  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月25日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sun.javafx.collections.MappingChange.Map;

/**  
 * @ClassName: GenericReflect2  
 * @Description: TODO(使用反射获取泛型信息)  
 * @author ronin  
 * @date 2019年3月25日  
 *    
 */
public class GenericReflect2 {
	public void test01(Map<String, Person> map,List<Person> person) {
		System.out.println("test01()......");
	}
	
	public Map<Integer, Person>  test02() {
		System.out.println("test02()......");
		return null;
	}
	
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @Title: fun1  
	 * @Description: TODO(获取指定方法泛型参数信息:Map<String, Person> map,List<Person> person)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1() throws NoSuchMethodException, SecurityException{
		Class<GenericReflect2> gf2 = GenericReflect2.class;
		Method method = gf2.getMethod("test01", Map.class,List.class);
		Type[] parameterTypes = method.getGenericParameterTypes();
		for(Type parameterType:parameterTypes){
			System.out.println("#:"+parameterType);
			if(parameterType instanceof ParameterizedType){
				Type[] actualTypeArguments = ((ParameterizedType)parameterType).getActualTypeArguments();
				for(Type actualTypeArgument:actualTypeArguments){
					System.out.println("*:"+actualTypeArgument);
				}
			}
			
		}
	}
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @Title: fun2  
	 * @Description: TODO(获取指定方法返回值泛型信息)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2() throws NoSuchMethodException, SecurityException{
		Class<GenericReflect2> gf2 =  GenericReflect2.class;
		Method method = gf2.getMethod("test02", null);
		Type returnType = method.getGenericReturnType();
		System.out.println("#:"+returnType);
		if(returnType instanceof ParameterizedType){
			Type[] actualTypeArguments = ((ParameterizedType)returnType).getActualTypeArguments();
			for(Type actualTypeArgument:actualTypeArguments){
				System.out.println("*:"+actualTypeArgument);
			}
		}
	}
	
	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @Title: fun3  
	 * @Description: TODO(反射突破泛型限制
	 * 		泛型对类型的限制仅仅作用于编译期，在运行期泛型会擦除，所以使用反射可以绕过调用方法传递参数时泛型对参数数据类型的限制
	 * 		泛型:仅用于编译器检查
	 * 		反射:运行时动态加载)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		ArrayList<String> list = new ArrayList<String>();
		list.add("100");
		list.add("200");
		list.add("300");
		/**
		 * 直接调用下面的方法，会报错
		 */
		//list.add(100);
		System.out.println("使用反射调用设置值之前:"+list);
		/**
		 * 使用反射调用，不会报错
		 */
		Class<? extends ArrayList> clazz = list.getClass();
		Method method = clazz.getDeclaredMethod("add", Object.class);
		method.invoke(list, 400);
		System.out.println("使用反射设置值之后:"+list);
		
	}
}
