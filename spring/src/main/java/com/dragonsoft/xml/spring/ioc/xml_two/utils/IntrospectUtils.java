package com.dragonsoft.xml.spring.ioc.xml_two.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;


/**  
 * @author ronin
 * @date 2019年3月17日  
 */
public class IntrospectUtils {
	
	
	/**
	 * JavaBean内省技术获取方法对象
	 * @param bean
	 * @param bean
	 * @return Method
	 * @throws
	 */
	public static Method getWriteMethod(Object bean,String name){
		//1.分析Bean对象，得到BeanInfo
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass(), Object.class);
			//2.根据BeanInfo获取所有属性的描述器
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			//3.遍历这些属性描述器
				if(pds != null){
					for(PropertyDescriptor pd:pds){
						//判断当前遍历的属性描述器描述的属性是不是我们需要找的属性
						//获取当前属性描述器描述的属性名称
						String pdName = pd.getName();
						//如果属性描述器描述的是当前传进来的的属性，获得写入属性的set方法
						if(name.equals(pdName)){
							return  pd.getWriteMethod();
						}
					}
				}
			//4.返回找到的set方法
				//如果没有找打，抛出异常，提示用户检查是否有属性对应的set方法
		} catch (IntrospectionException e) {
			e.printStackTrace();
			throw new RuntimeException("请检查该"+bean+"有没有设置setter()方法");
		}
		
		return null;
		
	}
}
