/**  
 * @Title: UserController.java  
 * @Package com.dragonsoft.xml.spring.ioc.anno_one.entiry  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月20日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.spring.ioc.anno_one.entiry;

import com.dragonsoft.xml.spring.ioc.anno_one.anno.Controller;

/**  
 * @ClassName: UserController  
 * @Description: TODO(这里用一句话描述这个类的作用)  
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
