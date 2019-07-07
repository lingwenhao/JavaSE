/**  
 * @Title: Table.java  
 * @Package com.dragonsoft.reflectanno.application_orm  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月24日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflectanno.application_orm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**  
 * @ClassName: Table  
 * @Description: TODO(加在实体上的注解)  
 * @author ronin  
 * @date 2019年3月24日  
 */

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Table {
	String value();

}
