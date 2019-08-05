package com.dragonsoft.javassist;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.Test;

import com.dragonsoft.reflectanno.application_junit.Before;
import com.sun.istack.internal.Pool;
import com.sun.media.sound.ModelIdentifier;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.NotFoundException;

/**  
 * 测试JavaSsist API)
 * @author ronin  
 * @date 2019年3月26日  
 *    
 */
public class JavaSsist {
	
	/**
	 * @throws Exception 
	 * @Title: fun1  
	 * 使用JavaSsist生成新的class文件
	 * 						生成结果:在d:/myjava下生成 com/dragonsoft/javassist/EmployCt.class这个文件)  
	 * @param 
	 * @return void
	 * @throws
	 */
	public void fun1() throws Exception{
		/**
		 * 1.获取创建器
		 */
		ClassPool pool = ClassPool.getDefault();
		
		/**
		 * 2.创建类
		 */
		CtClass cc = pool.makeClass("com.dragonsoft.javassist.EmployCt");
		
		/**
		 * 3.创建属性
		 */
		CtField idField = CtField.make("private int id;",cc);
		CtField nameFile = CtField.make("private String name;",cc);
		//把属性加入到类中
		cc.addField(idField);
		cc.addField(nameFile);
		
		/**
		 * 4.创建方法
		 */
		//创建id属性的setter()/getter()方法
		CtMethod idSetMethod = CtMethod.make("public void setId(int id){this.id = id;}", cc);
		CtMethod idGetMethod = CtMethod.make("public int getId(){return this.id;}", cc);
		//创建name属性的setter()/getter()方法
		CtMethod nameSetMethod = CtMethod.make("public void setName(String name){this.name = name;}", cc);
		CtMethod nameGetMethod = CtMethod.make("public String getName(){return this.name;}", cc);
		
		//把方法添加到类中
		cc.addMethod(idSetMethod);
		cc.addMethod(idGetMethod);
		cc.addMethod(nameSetMethod);
		cc.addMethod(nameGetMethod);
		
		/**
		 * 5.创建有参构造方法(添加有参构造器)
		 * new CtClass[]{CtClass.intType,pool.get("java.lang.String"):
		 * 		int类型参数(基本类型参数):CtClass.intType
		 * 		String类型参数(引用类型参数):pool.get("java.lang.String")
		 */
		CtConstructor ctConstructorHasParam = new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")}, cc);
		//构造构造方法的方法体
		ctConstructorHasParam.setBody("{this.id = id; this.name = name;}");
		
		/**
		 * 6.创建无参构造方法(添加无参构造器)
		 */
		CtConstructor ctConstructorNoParam = new CtConstructor(null, cc);
		//构造构造方法的方法体
		ctConstructorNoParam.setBody("{}");
		
		/**
		 * 7.生成该java文件
		 */
		//cc.writeFile("d:/myjava");
	}
	
	
	/**
	 * 测试JavaSist API获取类的信息
	 * @param @throws NotFoundException
	 * @param @throws IOException
	 * @param @throws CannotCompileException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2() throws NotFoundException, IOException, CannotCompileException{
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.dragonsoft.javassist.Employ");
		byte[] bytecode = cc.toBytecode();
		System.out.println(Arrays.toString(bytecode));
		
		//获取类名
		System.out.println("类的全限定名:"+cc.getName());
		System.out.println("类名:"+cc.getSimpleName());
		System.out.println("类的接口的Class对象:"+cc.getInterfaces());
		System.out.println("类的父类的Class对象:"+cc.getSuperclass());
	}
	
	
	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws CannotCompileException 
	 * @throws NotFoundException 
	 * @Title: fun3  
	 * 通过 反射生成新的方法
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3() throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.dragonsoft.javassist.Employ");
		/**
		 * 添加方法方式1
		 */
		//CtMethod ctMethod = CtMethod.make("public int add(int a,int b){return a+b;}", cc);
		
		/**
		 * 添加方法方式2
		 */
		CtMethod ctMethod = new CtMethod(CtClass.intType,"add",new CtClass[]{CtClass.intType,CtClass.intType}, cc);
		ctMethod.setModifiers(Modifier.PUBLIC);
		ctMethod.setBody("{System.out.println(\"Hello World!\");System.out.println(\"Hello World!\");return $1+$2;}");
		cc.addMethod(ctMethod);
		
		/**
		 * 通过反射调用生成的方法
		 */
		Class<? extends Object> employClass = cc.toClass();
		Object object = employClass.newInstance();
		/**
		 * 使用反射获取指定名称的方法，使用javassist也可以获取到指定名称的方法，只不过参数传递的方式不同
		 */
		Method method = employClass.getDeclaredMethod("add", int.class,int.class);
		Object invoke = method.invoke(object, 1,2);
		System.out.println(invoke);
	}
	
	
	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws CannotCompileException 
	 * @Title: fun4  
	 * 使用javassit获取方法，并在方法调用之前对方法进行增强，实现在字节码层面对方法进行增强
	 * 		注意:javassit可以在字节码层面修改class文件的内容，假如修改了某个方法，但是并不能直接调用该方法，只能通过反射去调用)  
	 * @param @throws NotFoundException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun4() throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.dragonsoft.javassist.Employ");
		/**
		 * 获取到CtMethod对象
		 */
		CtMethod ctMethod = cc.getDeclaredMethod("sayHello", new CtClass[]{pool.get("java.lang.String")});
		//在方法执行前添加操作
		ctMethod.insertBefore("System.out.println(\"Before......\");");
		//在方法执行后添加操作
		ctMethod.insertAfter("System.out.println(\"After......\");");
		//在com.dragonsoft.javassist.Employ中第41行添加Java代码(操作)
		ctMethod.insertAt(41, "int b = 5; System.out.println(\"b的值是:\"+b);");
		
		/**
		 * 通过反射调用生成的方法
		 */
		Class<? extends Object> employClass = cc.toClass();
		Object object = employClass.newInstance();
		Method method = employClass.getDeclaredMethod("sayHello", String.class);
		Object invoke = method.invoke(object, "I am massage!");
		System.out.println(invoke);
	}
	
	
	@Test
	public void fun5() throws NotFoundException, CannotCompileException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.dragonsoft.javassist.Employ");
		/**
		 * 添加属性方式1
		 */
		//CtField schoolField = CtField.make("private String school", cc);
		/**
		 * 添加属性方式2
		 */
		CtField schoolField = new CtField(pool.get("java.lang.String"),"school",cc);
		schoolField.setModifiers(Modifier.PRIVATE);
		cc.addField(schoolField);
		
		/**
		 * javassist中提供了相关的api为创建的属性增加setter和getter方法
		 */
		cc.addMethod(CtNewMethod.getter("getSchool", schoolField));
		cc.addMethod(CtNewMethod.setter("setSchool", schoolField));
		
		/**
		 * 通过反射调用该属性的setter()和getter()方法，此处不作演示
		 */
	}
}
