/**  
 * @Title: Dog.java  
 * @Package com.dragonsoft.create.prototype  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package create.prototype.prototype_a;

import java.io.Serializable;
import java.util.Date;

/**  
 * @ClassName: Dog  
 * @Description: TODO(序列化/反序列化实现深克隆)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Dog implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Date birthday;
	/**  
	 * 创建一个新的实例 Dog.  
	 *    
	 */ 
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**  
	 * 创建一个新的实例 Dog.  
	 *  
	 * @param name
	 * @param birthday  
	 */ 
	public Dog(String name, Date birthday) {
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
		return "Dog [name=" + name + ", birthday=" + birthday + "]";
	}
	
}
