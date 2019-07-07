/**  
 * @Title: UserDao.java  
 * @Package com.dragonsoft.xml.spring.ioc.anno_one.entiry  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月20日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.anno_one.entiry;

import com.dragonsoft.xml.spring.ioc.anno_one.anno.Repository;

/**  
 * @ClassName: UserDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月20日  
 *    
 */
@Repository
public class UserDao {
	
	public void say(){
		System.out.println("sqy()....");
	}
}
