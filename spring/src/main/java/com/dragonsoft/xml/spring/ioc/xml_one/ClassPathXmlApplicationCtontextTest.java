package com.dragonsoft.xml.spring.ioc.xml_one;

import org.dom4j.DocumentException;

/**  
 * @author ronin
 * @date 2019年3月13日  
 *    
 */
public class ClassPathXmlApplicationCtontextTest {

	public static void main(String[] args) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		ClassPathXmlApplicationCtontext classPathXmlApplicationCtontext = new ClassPathXmlApplicationCtontext("applicationContext-ioc-xml-one.xml");
		User user1 = (User)classPathXmlApplicationCtontext.getBean("user");
		System.out.println("未重载的getBean()方法:"+user1);
		User user2 = classPathXmlApplicationCtontext.getBean("user",User.class);
		System.out.println("重载增强的getBean()方法:"+user2);
		
		
	}
}
