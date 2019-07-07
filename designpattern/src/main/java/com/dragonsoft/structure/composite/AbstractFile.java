/**  
 * @Title: AbstractFile.java  
 * @Package com.dragonsoft.structure.composite
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * 使用组合模式模拟杀毒软件架构
 */

/**  
 * @ClassName: AbstractFile  
 * @Description: TODO(模拟抽象组件)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface AbstractFile {
	/**
	 * @Title: killViruls  
	 * @Description: TODO(杀毒)  
	 * @param 
	 * @return void
	 * @throws
	 */
	void killViruls();
}

/**
 * @ClassName: imageFiles  
 * @Description: TODO(模拟Leaf节点:单个文件)  
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class imageFiles implements AbstractFile{

	private String name;
	
	/**  
	 * 创建一个新的实例 imageFiles.  
	 *  
	 * @param name  
	 */ 
	public imageFiles(String name) {
		super();
		this.name = name;
	}


	/**
	 * <p>Title: killViruls</p>  
	 * <p>Description: </p>    
	 * @see AbstractFile#killViruls()
	 */  
	
	@Override
	public void killViruls() {
		System.out.println("图像文件"+name+"，进行查杀......");
	}
	
}

/**
 * @ClassName: TextFiles  
 * @Description: TODO(模拟Leaf节点:单个文件)  
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class TextFiles implements AbstractFile {

	private String name;
	
	/**  
	 * 创建一个新的实例 TextFiles.  
	 *  
	 * @param name  
	 */ 
	public TextFiles(String name) {
		super();
		this.name = name;
	}


	/**
	 * <p>Title: killViruls</p>  
	 * <p>Description: </p>    
	 * @see AbstractFile#killViruls()
	 */  
	
	@Override
	public void killViruls() {
		System.out.println("文本文件"+name+"，进行查杀......");
	}
	
}

/**
 * @ClassName: Folder  
 * @Description: TODO(模拟容器组件:文件夹)  
 * @author ronin  
 * @date 2019年3月23日  
 *
 */
class Folder implements AbstractFile {

	private String name;
	
	/**  
	 * 创建一个新的实例 Folder.  
	 *  
	 * @param name  
	 */ 
	public Folder(String name) {
		super();
		this.name = name;
	}

	/**
	 * 定义容器，用来存放本容器构件下的子节点
	 */
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public void add(AbstractFile file){
		list.add(file);
	}
	
	public void remove(AbstractFile file){
		list.remove(file);
	}
	
	public AbstractFile getChild(int index){
		return list.get(index);
	}
	
	
	/**
	 * <p>Title: killViruls</p>  
	 * <p>Description: </p>    
	 * @see AbstractFile#killViruls()
	 */  
	
	@Override
	public void killViruls() {
		System.out.println("文件夹"+name+"，进行查杀......");
		for(AbstractFile file:list){
			file.killViruls();
		}
	}
	
}