package com.dragonsoft.reflectanno.application_junit;


/**  
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
