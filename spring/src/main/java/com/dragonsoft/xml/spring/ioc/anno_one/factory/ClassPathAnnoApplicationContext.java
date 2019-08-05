package com.dragonsoft.xml.spring.ioc.anno_one.factory;


import java.lang.annotation.Annotation;
import java.util.List;

import com.dragonsoft.xml.spring.ioc.anno_one.parse.ConfigManagerAnno;
import com.dragonsoft.xml.spring.ioc.anno_one.utils.ClassUtils;

/**  
 * @author ronin
 * @date 2019年3月20日  
 *    
 */
public class ClassPathAnnoApplicationContext implements BeanFactoryAnno{

	/**  
	 * 创建一个新的实例 ClassPathAnnoApplicationContext.  
	 *    
	 */ 
	public ClassPathAnnoApplicationContext() {
		super();
	}
	
	/**  
	 * 创建一个新的实例 ClassPathAnnoApplicationContext.  
	 *    
	 */ 
	public ClassPathAnnoApplicationContext(String path) {
		/**
		 * 1.根据配置文件获取要扫描的包的路径，并进行扫描包操作
		 */
		String basePackage = ConfigManagerAnno.getXmlConfig(path);
		/**
		 * 2.获取这个包下所有类的class文件
		 */
		List<Class<? extends Object>> classes = ClassUtils.getClasses(basePackage);
		for(Class classs:classes){
			Annotation[] annotations = classs.getAnnotations();
			for(Annotation annotation:annotations){
				Class<? extends Annotation> annotationType = annotation.annotationType();
				System.out.println(annotationType);
			}
		}
	}
	
}
