/**  
 * @author ronin
 * @date 2019年3月26日  
 * @version V1.0  
 */ 
package com.dragonsoft.javassist;


/**  
 * 测试JavaSsit API用到的实体
 * @author ronin  
 * @date 2019年3月26日  
 *    
 */
public class Employ {
	private String id;
	private int age;
	private String name;
	/**  
	 * 创建一个新的实例 Employ.  
	 *    
	 */ 
	public Employ() {
		super();
	}
	
	/**
	 * 使用javassist调用这个方法
	 * @param @param param
	 * @param @return
	 * @return String
	 * @throws
	 */
	public String sayHello(String param){
		System.out.println("我是参数:"+param);
		return "I am ok!";
	}
	/**  
	 * 创建一个新的实例 Employ.  
	 *  
	 * @param id
	 * @param age
	 * @param name  
	 */ 
	public Employ(String id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Employ [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
