package com.dragonsoft.logger;

import java.util.logging.Logger;

/**  
 * JDK自带的日志工具类的使用
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
