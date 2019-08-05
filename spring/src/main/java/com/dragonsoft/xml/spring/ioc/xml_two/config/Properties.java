package com.dragonsoft.xml.spring.ioc.xml_two.config;

/**  
 * @ClassName: Properties  
 * 描述xml中<bean/>标签的子标签<propertity name="" value="" ref=""/>
 * @author ronin  
 * @date 2019年3月16日  
 *    
 */
public class Properties {
	private String name;
	private String value;
	private String ref;
	/**  
	 * 创建一个新的实例 Properties.  
	 *    
	 */ 
	public Properties() {
		super();
	}
	/**  
	 * 创建一个新的实例 Properties.  
	 *  
	 * @param name
	 * @param value
	 * @param ref  
	 */ 
	public Properties(String name, String value, String ref) {
		super();
		this.name = name;
		this.value = value;
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Properties [name=" + name + ", value=" + value + ", ref=" + ref + "]";
	}
}
