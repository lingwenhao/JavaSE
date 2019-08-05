package com.dragonsoft.xml.dom4j_student;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**  
 * 这里用一句话描述这个类的作用
 * @author ronin  
 * @date 2019年3月13日  
 *    
 */
public class Dom4jParseXml_Student {
	
	@Test
	public void fun() throws DocumentException {
		SAXReader saxReader = new SAXReader();
		/**
		 * 获取document对象
		 */
		Document document = saxReader.read(getResourceAsStream("student.xml"));
		/**
		 * 获取根节点
		 */
		Element rootElement = document.getRootElement();
		System.out.println(document);
		getNodes(rootElement);
	}
	public InputStream getResourceAsStream(String xmlName){
		return this.getClass().getResourceAsStream(xmlName);
	}
	
	public void getNodes(Element node){
		System.out.println("当前节点名称:"+node.getName());
		System.out.println("当前节点内容:"+node.getTextTrim());
		/*
		 * 获取属性
		 */
		List<Attribute> attributes = node.attributes();
		for(Attribute attribute:attributes){
			System.out.println(attribute.getName()+"---"+attribute.getText());
		}
		/*
		 * 获取属性值
		 */
		String textTrim = node.getTextTrim();
		if(textTrim.length() != 0) {
			System.out.println("textTrim:" + textTrim);
		}
		/**
		 * 使用迭代器，读取子节点信息
		 */
		Iterator<Element> nodeIterator = node.elementIterator();
		while(nodeIterator.hasNext()){
			Element element = nodeIterator.next();
			getNodes(element);
		}
//		List<Element> listElement=node.elements();//所有一级子节点的list
//		for(Element e:listElement){//遍历所有一级子节点
//			this.getNodes(e);//递归
//		}

	}
}
