package com.dragonsoft.xml.spring.ioc.xml_one;

/**  
 * @author ronin
 * @date 2019年3月14日  
 */
public class User {
	private String name;
	private String age;
	
	/**  
	 * 创建一个新的实例 User.  
	 *    
	 */ 
	public User() {
		
	}
	/**  
	 * 创建一个新的实例 User.  
	 *  
	 * @param name
	 * @param age  
	 */ 
	public User(String name, String age) {
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
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
