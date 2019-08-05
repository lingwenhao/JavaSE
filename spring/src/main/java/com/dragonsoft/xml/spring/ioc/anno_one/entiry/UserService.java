package com.dragonsoft.xml.spring.ioc.anno_one.entiry;

import com.dragonsoft.xml.spring.ioc.anno_one.anno.Service;

/**  
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
