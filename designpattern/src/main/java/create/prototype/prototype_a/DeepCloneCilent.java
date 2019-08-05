package create.prototype.prototype_a;

import java.util.Date;

/**  
 * 测试深克隆/深复制
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class DeepCloneCilent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(4564654L);
		Person personProtoType = new Person("张三",date);
		System.out.println("原型:"+personProtoType);
		Person personClone1 = (Person)personProtoType.clone();
		System.out.println("克隆对象1:"+personClone1);
		
		/*
		 * 先创建克隆对象，再修改原型中引用类型属性的值
		 */
		Person personClone2 = (Person)personProtoType.clone();
		//修改原型中birthday指向的属性的值
		date.setTime(787987987988854L);
		System.out.println("修改后的原型:"+personProtoType.getBirthday());
		System.out.println("克隆对象2:"+personClone2.getBirthday());
		
		//深客隆:对比原型和克隆对象中引用类型的值，返回false
		System.out.println(personProtoType.getBirthday() == personClone2.getBirthday());
	}
}
