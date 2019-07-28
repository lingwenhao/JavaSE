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
    /**
     * 获取bean
     *
     * @param beanId
     * @return
     */
    Object getBean(String beanId);

    /**
     * 获取bean
     *
     * @param beanId
     * @param t
     * @param <T>
     * @return
     */
    <T> T getBean(String beanId, Class<T> t);
}
