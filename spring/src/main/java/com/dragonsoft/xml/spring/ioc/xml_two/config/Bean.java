/**  
 * @Title: Bean.java  
 * @Package com.dragonsoft.xml.spring.ioc.xmltwo.config  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月16日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.xml_two.config;

import java.util.List;

/**  
 * @ClassName: Bean  
 * @Description: TODO(描述xml中<bean id="" class=""/>标签
 * 			注意:一个<bean/>有多个<property/>标签)  
 * @author ronin  
 * @date 2019年3月16日  
 *    
 */
public class Bean {
	private String id;
	private String className;
	private String scope = "singleton";
	private List<Properties> perproties;
	/**  
	 * 创建一个新的实例 Bean.  
	 *    
	 */ 
	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**  
	 * 创建一个新的实例 Bean.  
	 *  
	 * @param id
	 * @param className
	 * @param scope
	 * @param perproties  
	 */ 
	public Bean(String id, String className, String scope, List<Properties> perproties) {
		super();
		this.id = id;
		this.className = className;
		this.scope = scope;
		this.perproties = perproties;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	public List<Properties> getPerproties() {
		return perproties;
	}
	public void setPerproties(List<Properties> perproties) {
		this.perproties = perproties;
	}
	
	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Bean [id=" + id + ", className=" + className + ", scope=" + scope + ", perproties=" + perproties + "]";
	}
	
}
