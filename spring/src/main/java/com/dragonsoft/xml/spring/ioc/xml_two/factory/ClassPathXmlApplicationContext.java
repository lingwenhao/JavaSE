/**  
 * @Title: ClassPathXmlApplicationContext.java  
 * @Package com.dragonsoft.xml.spring.xmltwo.factory  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月15日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.xml_two.factory;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import com.dragonsoft.xml.spring.ioc.xml_two.config.Bean;
import com.dragonsoft.xml.spring.ioc.xml_two.config.Properties;
import com.dragonsoft.xml.spring.ioc.xml_two.parse.ConfigManager;
import com.dragonsoft.xml.spring.ioc.xml_two.utils.IntrospectUtils;

/**  
 * @ClassName: ClassPathXmlApplicationContext  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月15日  
 *    
 */
public class ClassPathXmlApplicationContext implements BeanFactory{
	
	private Map<String,Object> context = new HashMap<String,Object>();
	
	private Map<String, Bean> xmlInfomMap;
	
	/**  
	 * 创建一个新的实例 ClassPathXmlApplicationContext.  
	 */ 
	public ClassPathXmlApplicationContext(String path) {
		/*
		 * 在构造函数中作如下步骤:
		 * 		1.根据传入的path值解析xml，获取xml的文件中的信息
		 * 		2.根据解析xml的信息，初始化所有Bean对象
		 */
		xmlInfomMap = ConfigManager.parseXml(path);
		Set<Entry<String, Bean>> entries = xmlInfomMap.entrySet();
		for(Entry<String, Bean> entry:entries){
			/**
			 * 获取beanId
			 */
			String beanId = entry.getKey();
			/**
			 * 获取value
			 */
			Bean beanInfo = entry.getValue();
			/**
			 * 根据beanId在HashMap(Context)域中查询，如果有和该beanId对应的，那么直接拿过
			 * 		来用，如果没有则创建一个，并(在初始化时)存放在HashMap<String,Bean>，相当于缓存
			 */
			Object object = context.get(beanId);
			if(object == null && beanInfo.getScope().equals("singleton")){
				object = createBean(beanInfo);
				context.put(beanId, object);
			}
		}
	}


	/**
	 * @return   
	 * @Title: createBean  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param bean
	 * @return void
	 * @throws  
	 */
	private Object createBean(Bean bean) {
		Class<? extends Object> clazz = null;
		Object newInstance = null;
		try {
			clazz = Class.forName(bean.getClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			newInstance = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		/**
		 * 给属性赋值
		 */
		List<Properties> properties = bean.getPerproties();
		if(!properties.isEmpty()){
			for(Properties propertie:properties){
				String name = propertie.getName();
				String value = propertie.getValue();
				String ref = propertie.getRef();
				if(StringUtils.isNotBlank(value)){
					Map<String, String[]> paramMap = new HashMap<String,String[]>();
					paramMap.put(name, new String[]{value});
					try {
						BeanUtils.populate(newInstance, paramMap);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
				if(StringUtils.isNotBlank(ref)){
					//value不为空，情况如下:
					//<bean id="" class=""><property name="" ref=""></bean>
					/**
					 * 注意:1.当ref不为空时，那么需要根据ref的值创建一个新的对象
					 * 	   2.每当创建新对象时，就需要判断当前域中是否存在该对象
					 */
					Object isExist = context.get(ref);
					if(isExist == null) {
						//域中不存在该对象
						isExist = createBean(xmlInfomMap.get(ref));
						//放入容器中
						if(xmlInfomMap.get(ref).getScope().equals("singleton")){
							context.put(ref, isExist);
						}
					}
					//域中存在该对象，直接用
					try {
						BeanUtils.setProperty(newInstance, name, isExist);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
			}
				
/**
 * 不使用BeanUtils封装数据，无法进行数据类型自动转换操作				
 */
//				//根据传入属性名称获取该改属性的set方法
//				Method method = IntrospectUtils.getWriteMethod(newInstance,name);
//				Object param = null;
//				if(StringUtils.isNotBlank(value)){
//					//value不为空，情况如下:
//					//<bean id="" class=""><property name="" value=""></bean>
//					param = value;
//				}
//				if(StringUtils.isNotBlank(ref)){
//					//value不为空，情况如下:
//					//<bean id="" class=""><property name="" ref=""></bean>
//					/**
//					 * 注意:1.当ref不为空时，那么需要根据ref的值创建一个新的对象
//					 * 	   2.每当创建新对象时，就需要判断当前域中是否存在该对象
//					 */
//					Object isExist = context.get(ref);
//					if(isExist == null) {
//						//域中不存在该对象
//						isExist = createBean(xmlInfomMap.get(ref));
//						//放入容器中
//						if(xmlInfomMap.get(ref).getScope().equals("singleton")){
//							context.put(ref, isExist);
//						}
//					}
//					//域中存在该对象，直接用
//					param = isExist;
//				}
//				try {
//					method.invoke(newInstance, param);
//				} catch (IllegalAccessException e) {
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					e.printStackTrace();
//				}
			}
		}
		return newInstance;
	}

	/**
	 * 获取bean
	 *
	 * @param beanId
	 * @param t
	 * @param <T>
	 * @return
	 */
	@Override
	public <T> T getBean(String beanId,Class<T> t) {
		return (T)this.getBean(beanId);
	}

	/**
	 * <p>Title: getBean</p>  
	 * <p>Description: </p>  
	 * @param beanId
	 * @return  
	 * @see BeanFactory#getBean(String)
	 */  
	@Override
	public Object getBean(String beanId) {
		//如何xml中scope配置的值是prototype，不是singleton，那么context中不会包含该Bean对象
		Object bean = context.get(beanId);
		if(bean == null) {
			//如果不存在该bean对象，那么就创建该对象
			bean = createBean(xmlInfomMap.get(beanId));
		}
		return bean;
	}

}
