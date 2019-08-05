package create.prototype.prototype_a;

import java.util.Date;

/**  
 * 深克隆/深复制实体
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Person implements Cloneable{

	private String name;
	private Date birthday;
	
	/**  
	 * 创建一个新的实例 Person.  
	 *    
	 */ 
	public Person() {
		super();
	}
	
	/**  
	 * 创建一个新的实例 Person.  
	 *  
	 * @param name
	 * @param birthday  
	 */ 
	public Person(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	/**
	 * <p>Title: clone</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws CloneNotSupportedException  
	 * @see Object#clone()
	 */  
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person personClone = (Person)super.clone();
		//克隆属性
		Date birthClone = (Date)this.birthday.clone();
		personClone.setBirthday(birthClone);
		return personClone;
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
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}
	
}
