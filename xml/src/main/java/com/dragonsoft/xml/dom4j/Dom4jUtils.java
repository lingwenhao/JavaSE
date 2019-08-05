package com.dragonsoft.xml.dom4j;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**  
 * Dom4j解析xml工具类
 * @author ronin  
 * @date 2019年3月8日  
 *    
 */
public class Dom4jUtils {
	
	public static final String PATH = "src/p1.xml";

	//返回document
	public static Document getDocument(String path) {
		try {
			//创建解析器
			SAXReader reader = new SAXReader();
			//得到document
			Document document = reader.read(path);
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//回写xml的方法
	public static void xmlWriters(String path,Document document) {
		try {
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path), format);
			xmlWriter.write(document);
			xmlWriter.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
