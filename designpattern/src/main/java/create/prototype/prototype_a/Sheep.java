/**  
 * @Title: Sheep.java  
 * @Package create.prototype
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package create.prototype.prototype_a;

import java.util.Date;

/**  
 * @ClassName: Sheep  
 * @Description: TODO(浅客隆/浅复制实体)  
 * @author ronin  
 * @date 2019年3月23日  
 */
public class Sheep implements Cloneable{
	/*
	 * Cloneable接口:空接口，标记接口
	 */
	private String name;
	private Date birthday;
	
	/**
	 * <p>Title: clone</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws CloneNotSupportedException  
	 * @see Object#clone()
	 */  
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//直接调用Object的clone()方法
		Object obj = super.clone();
		return obj;
	}

	/**  
	 * 创建一个新的实例 Sheep.  
	 *    
	 */ 
	public Sheep() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**  
	 * 创建一个新的实例 Sheep.  
	 *  
	 * @param name
	 * @param birthday  
	 */ 
	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", birthday=" + birthday + "]";
	}
	
}
