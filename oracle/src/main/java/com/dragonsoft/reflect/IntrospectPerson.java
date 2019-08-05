package com.dragonsoft.reflect;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**  
 * JavaBean的内省
 * @author ronin  
 * @date 2019年3月16日  
 *    
 */
public class IntrospectPerson {
	
	@Test
	public void fun() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		// 通过Introspector.getBeanInfo方法获取指定JavaBean类的BeanInfo信息
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        // 通过Introspector.getBeanInfo方法的重载方法获取指定JavaBean类的BeanInfo信息，并剔除Object类的方法
        //BeanInfo beanInfo = Introspector.getBeanInfo(Person.class,Object.class);
        /*
         *  通过BeanInfo的getPropertyDescriptors方法获取被操作的JavaBean类的所有属性
         *  	注意：该属性是通过get/set方法推断出来的属性，而不是有几个private String age();之类的
         */
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        /*
         * 历所有的属性
         */
        for (PropertyDescriptor pd : pds) {
            /*
             *  获取属性的名字
             *  	Bean的属性，其实和Person类中定义了几个变量无关，而是和setter和getter有关，一对算作一个属性，
             *  	如果落单的话，也算一个，因此，我们会看到，额外输出的属性名单中有我们的v，因为该JavaBean中有String getV()方法
             */
            String propName = pd.getName();
            //System.out.println(propName);
            // 获取属性的类型
            Class propType = pd.getPropertyType();
            //System.out.println(propType);
            // 获取属性对应的get方法
            Method writeMethod = pd.getWriteMethod();
            //System.out.println(writeMethod);
            // 获取属性对应的set方法
            Method readMethod = pd.getReadMethod();
            Person person = new Person();
            writeMethod.invoke(person,"10");
            System.out.println(person);
        }
	}
}
