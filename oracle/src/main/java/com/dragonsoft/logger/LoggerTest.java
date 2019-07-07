/**  
 * @Title: LoggerTest.java  
 * @Package com.dragonsoft.logger  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月24日  
 * @version V1.0  
 */ 
package com.dragonsoft.logger;

import java.util.logging.Logger;

/**  
 * @ClassName: LoggerTest  
 * @Description: TODO(JDK自带的日志工具类的使用)  
 * @author ronin  
 * @date 2019年3月24日  
 */
public class LoggerTest {

	private static Logger logger1 = Logger.getLogger("Person");
	private static Logger logger2 = Logger.getLogger("Person.class");
	
	public static void main(String[] args) {
		logger1.info("logger1......");
		logger2.info("logger2......");
	}
}
