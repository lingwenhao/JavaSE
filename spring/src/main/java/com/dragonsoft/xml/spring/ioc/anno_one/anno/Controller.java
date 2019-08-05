package com.dragonsoft.xml.spring.ioc.anno_one.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**  
 * @author ronin
 * @date 2019年3月21日  
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Controller {

}
