package com.dragonsoft.xml.spring.ioc.xml_two.entiry;

/**  
 * @author ronin
 * @date 2019年3月15日  
 *    
 */
public class Person {
	private Student student;
    private Teacher teacher;
    
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Person [student=" + student + ", teacher=" + teacher + "]";
	}
}
