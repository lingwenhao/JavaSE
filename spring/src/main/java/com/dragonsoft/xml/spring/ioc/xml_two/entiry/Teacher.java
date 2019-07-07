/**  
 * @Title: Teacher.java  
 * @Package com.dragonsoft.xml.spring.xmltwo.entiry  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月15日  
 * @version V1.0  
 */
package com.dragonsoft.xml.spring.ioc.xml_two.entiry;

/**
 * @ClassName: Teacher
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author ronin
 * @date 2019年3月15日
 * 
 */
public class Teacher {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Teacher [student=" + student + "]";
	}
	
}
