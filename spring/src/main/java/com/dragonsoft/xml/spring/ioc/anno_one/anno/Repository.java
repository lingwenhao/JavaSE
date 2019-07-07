/**  
 * @Title: Repository.java  
 * @Package com.dragonsoft.xml.spring.ioc.anno_one.anno  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月21日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.anno_one.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**  
 * @ClassName: Repository  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月21日  
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Repository {

}
