package com.dragonsoft.reflect;


/**  
 * 反射操作的类
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class Person {
	private String name;
	private String age;
	
	public Person() {
		super();
		System.out.println("我是无参构造方法...");
	}
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 测试没有对应的属性时，内省嫩不能拿到这个 方法只要有返回值，就可以拿到这个方法
	 * @param
	 * @return String
	 * @throws
	 */
	public String getV(){
		return "100";
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	private String testReflectOperatePrivateMethod(String param){
		System.out.println("传入的参数:"+param);
		return param;
	}
	
	private static String testReflectOperateStaticMentod(String param){
		System.out.println("传入的参数:"+param);
		return param;
	}
}
