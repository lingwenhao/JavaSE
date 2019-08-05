package com.dragonsoft.xml.spring.ioc.xml_two.factory;

/**  
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
