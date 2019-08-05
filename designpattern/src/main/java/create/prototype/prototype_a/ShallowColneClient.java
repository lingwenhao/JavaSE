/**  
 * @author ronin
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package create.prototype.prototype_a;

import java.util.Date;

/**  
 * 客户端:测试浅客隆/浅拷贝模式的原型模式
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class ShallowColneClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(4564654L);
		Sheep sheepPrototype = new Sheep("多利",date);
		System.out.println("原型对象:"+sheepPrototype);
		
		Sheep sheepClone1 = (Sheep)sheepPrototype.clone();
		System.out.println("克隆对象1:"+sheepClone1);
		
		/**
		 * 判断原型对象和克隆的对象引用值是否相同:false
		 */
		//System.out.println("判断原型对象和克隆的对象引用值是否相同:"+(sheepPrototype == sheepClone1));
		
		Sheep sheepClone2 = (Sheep)sheepPrototype.clone();
		sheepClone2.setName("张三");
		System.out.println("克隆对象2:"+sheepClone2);
		
		/*
		 * 先创建克隆对象，再修改原型中引用类型属性的值
		 */
		Sheep sheepClone3 = (Sheep)sheepPrototype.clone();
		//修改原型中birthday指向的属性的值
		date.setTime(7788854L);
		System.out.println("修改后的原型:"+sheepPrototype.getBirthday());
		
		/**
		 * 打印后可以看出克隆出来的对象的birthday的属性的值也收到了影响
		 */
		System.out.println("克隆对象3:"+sheepClone3.getBirthday());
		
		//浅客隆:对比原型和克隆对象中中引用类型的值，返回true
		System.out.println(sheepPrototype.getBirthday() == sheepClone3.getBirthday());
	}
}
