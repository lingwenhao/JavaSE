/**  
 * @Title: Person.java  
 * @Package com.dragonsoft.reflect.application_junit  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月14日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflectanno.application_junit;


/**  
 * @ClassName: Person  
 * @Description: TODO(Person JavaBean)  
 * @author ronin  
 * @date 2019年3月14日  
 *    
 */
public class Person {
	
	@Before
	public void before(){
		System.out.println("before方法执行了...");
	}
	
	@Test
	public void test(){
		System.out.println("test方法执行了...");
	}
	
	@After
	public void after(){
		System.out.println("after方法执行了...");
	}
	
}
