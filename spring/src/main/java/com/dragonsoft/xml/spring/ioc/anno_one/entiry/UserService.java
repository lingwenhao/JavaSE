/**  
 * @Title: UserService.java  
 * @Package com.dragonsoft.xml.spring.ioc.anno_one.entiry  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月20日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.anno_one.entiry;

import com.dragonsoft.xml.spring.ioc.anno_one.anno.Service;

/**  
 * @ClassName: UserService  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author ronin  
 * @date 2019年3月20日  
 */

@Service
public class UserService implements IUserService{

	private UserDao userDao;
	/**
	 * <p>Title: say</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.xml.spring.ioc.anno_one.entiry.IUserService#say()  
	 */  
	
	public void say() {
		userDao.say();
	}

}
