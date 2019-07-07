/**  
 * @Title: ReflectPlus.java  
 * @Package com.dragonsoft.reflect  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月29日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

/**  
 * @ClassName: ReflectPlus  
 * @Description: TODO(反射深入)  
 * @author ronin  
 * @date 2019年3月29日  
 *    
 */
public class ReflectPlus {

	/**
	 * @Title: fun  
	 * @Description: TODO(.class和getClass()区别:
	 * 			.getClass()明显是一个方法，是需要创建对象才能调用的)  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun(){
		/**
		 * .class:
		 * 		如果知道类名，可以使用:类名.class获取Class对象
		 */
		Class<? extends Object> reflectPlus = ReflectPlus.class;
		
		/**
		 * getClass():如果知道对象，可以获取Class对象
		 */
		ReflectPlus reflectPlusClass = new ReflectPlus();
		Class<? extends ReflectPlus> clazz = reflectPlusClass.getClass();
	}
	
}
