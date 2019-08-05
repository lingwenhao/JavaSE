package com.dragonsoft.reflectanno.application_orm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**  
 * 解析实体上的注解
 * @author ronin  
 * @date 2019年3月24日  
 *    
 */
public class ParseEntity {
	public static void main(String[] args) {
		Class<? extends Object> clazz = null;
		try {
			clazz = ParseEntity.class.getClassLoader().loadClass("com.dragonsoft.reflectanno.application_orm.Student");
		
			/**
			 * 获取该类上所有注解
			 */
			Annotation[] annotations = clazz.getAnnotations();
			for(Annotation annotation:annotations){
				System.out.println(annotation);
			}
			
			/**
			 * 获取该类上指定名称的属性
			 */
			Table table = clazz.getAnnotation(Table.class);
			System.out.println(table.value());
			
			/**
			 * 获取该类中的字段名称和该字段上所加的指定注解
			 */
			Field[] fields = clazz.getDeclaredFields();
			for(Field field:fields){
				Column column = field.getAnnotation(Column.class);
				System.out.println("属性名称:"+field.getName()+"---该属性上的注解:"+column.toString());
			}
			
			/**
			 * 根据获取到的属性名称和属性上的注解的信息拼接出SQL语句，使用JDBC执行该语句完成ORM映射
			 */
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
