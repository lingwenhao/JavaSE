package create.prototype.prototype_a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**  
 * 使用序列化/反序列化实现深克隆
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class DeepCloneSerizlizeClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date date = new Date(84879894546L);
		Dog dogPrototype = new Dog("多利",date);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(dogPrototype);
		
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		/**
		 * 完成深克隆
		 */
		Dog dogPrototypeClone = (Dog)ois.readObject();
		
		//修改原型中birthday指向的属性的值
		System.out.println("修改前的原型:"+dogPrototype.getBirthday());
		date.setTime(787987987988854L);
		System.out.println("修改后的原型:"+dogPrototype.getBirthday());
		System.out.println("克隆对象:"+dogPrototypeClone.getBirthday());
		
		//深客隆:对比原型和克隆对象中引用类型的值，返回false
		System.out.println(dogPrototype.getBirthday() == dogPrototypeClone.getBirthday());
	}
}
