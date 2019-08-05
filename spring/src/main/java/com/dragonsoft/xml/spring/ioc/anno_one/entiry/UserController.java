package com.dragonsoft.xml.spring.ioc.anno_one.entiry;

import com.dragonsoft.xml.spring.ioc.anno_one.anno.Controller;

/**  
 * @author ronin
 * @date 2019年3月20日  
 */

@Controller
public class UserController {
	private IUserService userService;
	public void say(){
		userService.say();
	}
}
