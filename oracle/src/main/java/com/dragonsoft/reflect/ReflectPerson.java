package com.dragonsoft.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**  
 * 使用反射操作Person类
 * @author ronin  
 * @date 2019年3月10日  
 *    
 */
public class ReflectPerson {
	/**
	 * Java异常增强:
	 * 		1.Throwable
	 * 			--- Exception
	 * 			--- Error
	 * 		2.throws：在方法声明时抛出异常，有问题直接抛给上层调用者
	 * 		  throw：在方法体中书写，作用是可以手动抛出异常(该方法没有被上层调用时，可以更直观的可以看到异常信息)
	 * Java反射增强:
	 * 		反射必调用被操作对象的无参构造方法
	 */
	
	
	
	/**
	 * @throws ClassNotFoundException 
	 * 四种方式获得反射对象/Class类:反射必走无参(包括父类无参、子类无参)
	 * @param
	 * @return void
	 * @throws
	 */
	@Test
	public void getPersonClazz() throws ClassNotFoundException{
		//方式1:该对象自身的.class属性
		Class<Person> clazz1 = Person.class;
		System.out.println(clazz1);
		//方式2:根据运行时的类的对象
		Person person = new Person();
		Class<? extends Object> clazz2 = person.getClass();
		System.out.println(clazz2);
		//方式3:Class的静态方法获取:体现反射的动态性
		Class<? extends Object> clazz3 = Class.forName("com.dragonsoft.reflect.Person");
		System.out.println(clazz3);
		//方式4:通过类加载器获取
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class<? extends Object> clazz4 = classLoader.loadClass("com.dragonsoft.reflect.Person");
		System.out.println(clazz4);
	}
	
	
	/**
	 * 反射操作无参构造方法,获取对象
	 * @throws Exception
	 * @param
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1 () throws Exception{
		//1.获取class对象
		Class<? extends Object> personClass = getClass().forName("com.dragonsoft.reflect.Person");
		System.out.println("包名+类名:"+personClass.getName());
		System.out.println("类名:"+personClass.getSimpleName());
		//2.得到Person实例，反射操作无参构造方法
			/**
			 * 反射通过无参构造器实例化对象对象方式1:
			 */
		//Person person = (Person)personClass.newInstance();
			/**
			 * 反射通过无参构造器实例化对象对象方式2:
			 */
		//Person person = (Person)personClass.getConstructor(new Class[]{}).newInstance(new Object[]{});
			/**
			 * 反射通过无参构造器实例化对象对象方式3:
			 */
		//Constructor<?> constructor = personClass.getConstructor(new Class[] {});
		//Person person = (Person)constructor.newInstance();
			/**
			 * 反射通过无参构造器实例化对象对象方式4:
			 */
		Constructor<?> constructor = personClass.getConstructor(new Class[] {});
		Person person = (Person)constructor.newInstance(new Object[]{});
		//3.执行方法
		person.setName("张三");
		System.out.println(person);
	}
	
	/**
	 * 反射操作有参构造方法,获取对象
	 * @throws Exception
	 * @param
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2() throws Exception{
		//1.获取class对象
		Class<? extends Object> personClass = Class.forName("com.dragonsoft.reflect.Person");
		//2.使用class获取有参构造方法的构造器，注意：传入的参数类型为Clas类型的
			/**
			 * 获取有参构造器方式1:直接传入两个参数
			 */
		//Constructor constructor = personClass.getConstructor(String.class,String.class);
			/**
			 * 获取有参构造器方式2:传入一个Classs[]对象
			 */
		Constructor constructor = personClass.getConstructor(new Class[]{String.class,String.class});
		//3.使用构造器操作构造方法，传入构造方法参数的值
		Person person = (Person)constructor.newInstance("李四","20");
		System.out.println(person);
	}
	
	/**
	 * 反射操作类中的私有属性
	 * @throws Exception
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3() throws Exception{
		//1.获取class对象
		Class personClass = Class.forName("com.dragonsoft.reflect.Person");
		//2.得到Person对象
		Person person = (Person)personClass.newInstance();
		//3.得到name属性
		/**
		 * getDeclaredFields():得到所有的属性
		 */
		//Field[] declaredFields = personClass.getDeclaredFields();
		//System.out.println(Arrays.toString(declaredFields));
		
		/**
		 * 获取单个属性
		 */
		Field nameField = personClass.getDeclaredField("name");
		
		/**
		 * 通过反射写入属性
		 */
		//设置可以操作私有属性
		nameField.setAccessible(true);
		//第一个参数:上面获取的类的实例 第二个参数:属性的具体值
		nameField.set(person, "我是你大爷"); 
		System.out.println(person);
		
		/**
		 * 通过反射读取属性
		 */
		String  name = (String)nameField.get(person);
		System.out.println("通过反射读取属性:"+name);
	}

	
	/**
	 * 使用反射操作public修饰的方法，不是private修饰的方法
	 * @throws Exception 参数  
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun4() throws Exception{
		//1.获取class对象
		Class personClass = Class.forName("com.dragonsoft.reflect.Person");
		//2.得到Person对象
		Person person = (Person)personClass.newInstance();
		//3.操作普通方法
			//两个参数:1.方法名		2.要执行的方法需要的参数的值，如下:setName("xxxxxxx");
		Method reflectOperator = personClass.getDeclaredMethod("setName", String.class);
		//4.使用反射执行该方法
		reflectOperator.invoke(person, "测试使用反射执行方法");
		System.out.println(person);
	}
	
	
	/**
	 * 使用反射操作私有方法
	 * @throws Exception
	 * @return void
	 * @throws
	 */
	@Test
	public void fun5() throws Exception{
		//1.获取class对象
		Class personClass = getClass().forName("com.dragonsoft.reflect.Person");
		//2.获取Person实例
		Person person = (Person)personClass.newInstance();
		//3.使用反射操作私有方法
		Method declaredMethod = personClass.getDeclaredMethod("testReflectOperatePrivateMethod", String.class);
		//4.设置可以操作私有方法
		declaredMethod.setAccessible(true);
		//5.使用反射操作该私有方法
		declaredMethod.invoke(person, "我是参数...");
	}
	
	/**
	 * 使用反射操作静态方法
	 * @throws Exception
	 * @return void
	 * @throws
	 */
	@Test
	public void fun6() throws Exception{
		//1.获取class对象
		Class personClass = getClass().forName("com.dragonsoft.reflect.Person");
		//2.获取方法操作器
		Method declaredMethod = personClass.getDeclaredMethod("testReflectOperateStaticMentod", String.class);
		//3.设置可以操作私有方法
		declaredMethod.setAccessible(true);
		//4.使用反射操作该静态方法，注意：因为操作的方法是静态方法，所以不需要传入Person的实例对象
		Object invoke = declaredMethod.invoke(null, "hello world");
		System.out.println(invoke);
	} 
	
	/**
	 * 使用反射获取属性修饰符:public/private
	 * @throws Exception
	 * @return void
	 * @throws
	 */
	@Test
	public void fun7() throws Exception{
		//1.获取class对象
		Class personClass = getClass().forName("com.dragonsoft.reflect.Person");
		//2.获取属性
		Field nameFiled = personClass.getDeclaredField("age");
		//3.获取属性的修饰符
		int currentModifiyCode = nameFiled.getModifiers();
		System.out.println(currentModifiyCode);
		ModifyEnum[] modifies = ModifyEnum.values();
		for(ModifyEnum modify:modifies){
			if(currentModifiyCode == modify.getCode()){
				System.out.println(modify.getDesc());
			}
		}
	} 
	
	
	/**
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * 获取class对象/构造器加强:直接可以获取到指定类型的Class对象和构造器，不用再强行转换了
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun8() throws NoSuchMethodException, SecurityException{
		/**
		 * 1.获取指定类型的Class对象
		 */
		Class<Person>  personClass = Person.class;
		/**
		 * 2.获取指定类型的构造器
		 */
		Constructor<Person> personConstructor = personClass.getConstructor();
		System.out.println("Person类型的无参构造器:"+personConstructor);
	}
	
	/**
	 * 获取数组的class的hashcode的值取决于数组的维度，与数组的长度无关
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void fun9(){
		int[] a = new int[10];
		int[] b = new int[20];
		System.out.println(a.getClass().hashCode());
		System.out.println(b.getClass().hashCode());
	}
	
}
