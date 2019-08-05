/**  
 * @Title: MyAnno1.java  
 * @Package com.dragonsoft.anno
 * @author ronin  
 * @date 2019年3月12日  
 * @version V1.0  
 */ 
package com.dragonsoft.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 一个简单的注解
 * @author ronin
 * @date 2019年3月12日  
 */

@Anno1
@Anno2(name="zhangsan",age=100)
@Anno3(100)
@Anno4(a=100,
		b="hello",
		c=ColorEnum.BLUE,
		d=String.class,
		e=@Anno2(name="zhangsan",age=100),
		//f=100
		f={100,500,1000}
		)
public class MyAnno1 {

}

@interface Anno1 {
	
}
@interface Anno2 {
	/**
	 * 注解的属性
	 * @Title: age  
	 * @throws
	 */
	int age();
	String name();
	
	/**
	 * 为注解的属性设置默认值
	 * @Title: school  
	 * @param @return
	 * @return String
	 * @throws
	 */
	String school() default "UFE";
}

@interface Anno3{
	//如果该注解只有一个属性而且该属性的值名为value，则在使用时可以直接写@Anno3(100)，而不需要写@Anno3(value=100)
	int value();
	String name() default "zhangsan";
}

/**
 *  注解属性的类型:
 *  	8种基本类型
 * 		String
 * 		Enum
 * 		Class
 * 		注解类型
 * 		以上类型的一维数组类型，如{"",""},
 *	注意事项:
 *		1.Integer是包装类，不属于上述范围
 *		2.当给数组类型的属性赋值时，如果数组元素的个数为1，则赋值时可以省略大括号
 */
@interface Anno4{
	int a();
	String b();

	/**
	 * 枚举类型的属性
	 */
	ColorEnum c();
	Class d();

	/**
	 * 注解类型的属性
	 */
	Anno2 e();
	int[] f();
}

/**
 * 测试注解的作用目标限定以及保留策略限定
 */
@Target(value={ElementType.METHOD,ElementType.TYPE})
/**
 * 源代码文件（SOURCE）：注解只在源代码中存在，当编译时就被忽略了
 * 字节码文件（CLASS）：注解在源代码中存在，然后编译时会把注解信息放到了class文件，但JVM在加载类时，会忽略注解！
 * JVM中（RUNTIME）：注解在源代码、字节码文件中存在，并且在JVM加载类时，会把注解加载到JVM内存中（它是唯一可反射注解！）
 */
@interface Anno5{

}