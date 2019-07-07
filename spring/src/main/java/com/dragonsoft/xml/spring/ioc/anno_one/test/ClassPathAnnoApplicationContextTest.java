/**  
 * @Title: ClassPathAnnoApplicationContextTest.java  
 * @Package com.dragonsoft.xml.spring.ioc.anno_one.test  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月20日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.anno_one.test;

import com.dragonsoft.xml.spring.ioc.anno_one.factory.ClassPathAnnoApplicationContext;

/**  
 * @ClassName: ClassPathAnnoApplicationContextTest  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月20日  
 *    
 */
public class ClassPathAnnoApplicationContextTest {
	public static void main(String[] args) {
		ClassPathAnnoApplicationContext applicationContext = new ClassPathAnnoApplicationContext("applicationContext-ioc-anno-one.xml");
	}
}
