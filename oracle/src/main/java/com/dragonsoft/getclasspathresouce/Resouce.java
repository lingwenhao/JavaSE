/**  
 * @Title: Resouce.java  
 * @Package com.dragonsoft.getclasspathresouce  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月13日  
 * @version V1.0  
 */ 
package com.dragonsoft.getclasspathresouce;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**  
 * @ClassName: Resouce  
 * @Description: TODO(使用ClassLoader和Class获取类路径下的资源)  
 * @author ronin  
 * @date 2019年3月13日  
 *    
 */
public class Resouce {
	/**
	 * @Title: fun  
	 * @Description: TODO(使用ClassLoader获取根目录下的类路径资源，不能加/)  
	 * @param @throws IOException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun1() throws IOException{
		/**
		 * 相对于class文件夹位置，获取资源时不能以/开头，可以使a.txt，但不能是/a.txt
		 */
		ClassLoader classLoader = this.getClass().getClassLoader();
		InputStream resourceAsStream = classLoader.getResourceAsStream("root.txt");
		System.out.println(resourceAsStream);
		System.out.println(IOUtils.toString(resourceAsStream));
	}
	
	/**
	 * @Title: fun  
	 * @Description: TODO(使用ClassLoader获取包目录下的类路径/WEB-INFO/classes下资源)  
	 * @param @throws IOException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun2() throws IOException{
		/**
		 * 相对于class文件夹位置，获取资源时不能以/开头，可以是com/dragonsoft/demo/a.txt，但不能是/com/dragonsoft/demo/a.txt
		 */
		ClassLoader classLoader = this.getClass().getClassLoader();
		InputStream resourceAsStream = classLoader.getResourceAsStream("com/dragonsoft/getclasspathresouce/packageroot.txt");
		System.out.println(resourceAsStream);
		System.out.println(IOUtils.toString(resourceAsStream));
	}
	
	
	/**
	 * @Title: fun3  
	 * @Description: TODO(使用Class获取根目录下的类路径资源，与类加载器效果相同，加/)  
	 * @param @throws IOException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun3() throws IOException{
		/**
		 * 相对于class文件夹位置
		 */
		Class classLoader = this.getClass();
		InputStream resourceAsStream = classLoader.getResourceAsStream("/root.txt");
		System.out.println(resourceAsStream);
		System.out.println(IOUtils.toString(resourceAsStream));
	}
	
	/**
	 * @Title: fun4  
	 * @Description: TODO(使用Class获取包目录下的类路径资源)  
	 * @param @throws IOException
	 * @return void
	 * @throws
	 */
	@Test
	public void fun4() throws IOException{
		/**
		 * 相对于当前文件对应的class位置
		 */
		Class classLoader = this.getClass();
		InputStream resourceAsStream = classLoader.getResourceAsStream("packageroot.txt");
		System.out.println(resourceAsStream);
		System.out.println(IOUtils.toString(resourceAsStream));
	}
}
