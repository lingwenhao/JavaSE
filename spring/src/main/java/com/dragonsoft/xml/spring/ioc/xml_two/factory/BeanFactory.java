/**  
 * @Title: BeanFactory.java  
 * @Package com.dragonsoft.xml.spring.ioc.xmltwo.factory 
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月15日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.xml_two.factory;

/**  
 * @ClassName: BeanFactory  
 * @Description: TODO(BeanFactory)  
 * @author ronin  
 * @date 2019年3月15日  
 *    
 */
public interface BeanFactory {
    //核心方法getBean
    Object getBean(String beanId);
    //核心方法getBean的重载
    <T> T getBean(String beanId, Class<T> t);
}
