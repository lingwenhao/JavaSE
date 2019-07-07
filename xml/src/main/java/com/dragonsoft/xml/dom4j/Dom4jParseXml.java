/**  
 * @Title: Dom4jParseXml.java  
 * @Package com.dragonsoft.xml.dom4j  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月7日  
 * @version V1.0  
 */ 
package com.dragonsoft.xml.dom4j;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**  
 * @ClassName: Dom4jParseXml  
 * @Description: TODO(使用dom4j解析xml)  
 * @author ronin  
 * @date 2019年3月7日  
 *    
 */
public class Dom4jParseXml {
	public static void main(String[] args) throws DocumentException, IOException {
		/**
		 * 得到xml文档的root节点
		 */
		Document document = dom4jParseXmlgetDocumentObject();
		/**
		 * 获取所有子节点信息
		 */
		selectAllChildNode(document);
		/**
		 * 得到所有的p1标签
		 */
		selectAllP1Tag(document);
		/**
		 * 得到根节点下第一个P1节点中name标签的值
		 */
		selectFirstP1Tag(document);
		/**
		 * 得到根节点下第二个P2节点中name标签的值
		 */
		selectSecondP1Tag(document);
		/**
		 * 在第一个p1节点的末尾添加一个子节点
		 */
		//addChildeNode(document);
		/**
		 * 在特定的位置添加一个节点,在第一个p1的name节点前添加一个节点<school>我是你大爷</school>
		 */
		//addChildeNodeAtPosition(document);
		/**
		 * 修改第一个p1节点下面的name的值
		 */
		//modifyNodeText(document);
		/**
		 * 删除第一个p1节点下面的school节点
		 */
		//deleteFirstP1SchooleNode(document);
		/**
		 * 使用Dom4j获取根节点下第一个p1标签的属性值
		 */
		getNodeAttribute(document);
	}

	/**  
	 * @Title: selectAllChildNode  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param document
	 * @return void
	 * @throws  
	 */
	private static void selectAllChildNode(Document document) {
		/**
		 * 1.获取跟节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 获取所有子节点
		 */
		List<Element> elements = rootElement.elements();
		/**
		 * 3.遍历所有子节点
		 */
		Iterator<Element> iterator = elements.iterator();
		while(iterator.hasNext()){
			System.out.println("每一个子节点:"+iterator.next().getName());
		}
	}

	/**  
	 * @Title: getNodeAttribute  
	 * @Description: TODO(使用Dom4j获取根节点下第一个p1标签的属性值)  
	 * @param @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void getNodeAttribute(Document document) {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/*
		 * 2.获取第一个p1节点	
		 */
		Element firstP1Node = rootElement.element("p1");
		/**
		 * 3.根据id的值获取属性值
		 */
		String attributeValue = firstP1Node.attributeValue("id");
		System.out.println(attributeValue);
	}

	/**
	 * @throws IOException   
	 * @Title: deleteFirstP1SchooleNode  
	 * @Description: TODO(删除第一个p1节点下面的school节点)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void deleteFirstP1SchooleNode(Document document) throws IOException {
		/**		
		 * 1.得到根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.得到第一个p1节点
		 */
		Element firstP1Node = rootElement.element("p1");
		/**
		 * 3.得到第一个p1节点下面的第一个school标签
		 */
		Element schoolNode = firstP1Node.element("school");
		/**
		 * 4.删除(使用p1删除school节点)		 
		 */
		boolean isRemove = firstP1Node.remove(schoolNode);
		System.out.println(isRemove);
		/**
		 * 5.回写xml
		 */
		//格式化(有缩进效果)
		OutputFormat format = OutputFormat.createPrettyPrint();
		//格式化(没有缩进效果)
		//OutputFormat format = OutputFormat.createCompactFormat();
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/com/dragonsoft/xml/dom4j/person.xml"),format);
		/**
		 * 6.回写内存中的节点到xml文档中
		 */
		xmlWriter.write(document);
		/**
		 * 7.关闭流
		 */
		xmlWriter.close();
	}

	/**
	 * @throws IOException   
	 * @Title: modifyNodeText  
	 * @Description: TODO(修改第一个p1节点下面的name的值)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void modifyNodeText(Document document) throws IOException {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.获取根节点下第一个p1节点
		 */
		Element fistP1Node = rootElement.element("p1");
		/**
		 * 3.获取第一个p1节点下的name元素
		 */
		Element nameNode = fistP1Node.element("name");
		/**
		 * 4.修改值name节点的值
		 */
		nameNode.setText("我是你爸爸");
		/**
		 * 5.回写xml
		 */
		//格式化(有缩进效果)
		OutputFormat format = OutputFormat.createPrettyPrint();
		//格式化(没有缩进效果)
		//OutputFormat format = OutputFormat.createCompactFormat();
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/com/dragonsoft/xml/dom4j/person.xml"),format);
		/**
		 * 6.回写内存中的节点到xml文档中
		 */
		xmlWriter.write(document);
		/**
		 * 7.关闭流
		 */
		xmlWriter.close();
	}

	/**
	 * @throws IOException 
	 * @Title: addChildeNodeAtPosition
	 * @Description: TODO(在特定的位置添加一个节点,在第一个p1的name节点前添加一个节点<school>我是你大爷</school>)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void addChildeNodeAtPosition(Document document) throws IOException {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.得到第一个p1节点
		 */
		Element firstP1Node = rootElement.element("p1");
		/**
		 * 3.获取p1下所有元素
		 * 		elements()方法返回list集合
		 * 		使用list的方法，在特定的元素下添加元素
		 */
		List<Element> p1List = firstP1Node.elements();
		//创建元素
		Element schoolNode = DocumentHelper.createElement("school");
		//在school下创建文本
		schoolNode.setText("UFE");
		p1List.add(0, schoolNode);
		/**
		 * 4.回写新创建的节点到内存中
		 */
		//格式化(有缩进效果)
		OutputFormat format = OutputFormat.createPrettyPrint();
		//格式化(没有缩进效果)
		//OutputFormat format = OutputFormat.createCompactFormat();
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/com/dragonsoft/xml/dom4j/person.xml"),format);
		/**
		 * 5.回写内存中的节点到xml文档中
		 */
		xmlWriter.write(document);
		/**
		 * 6.关闭流
		 */
		xmlWriter.close();
		
	}

	/**
	 * @throws IOException   
	 * @Title: addChildeNode  
	 * @Description: TODO(在第一个p1节点的末尾添加一个子节点)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void addChildeNode(Document document) throws IOException {
		/**
		 * 1.得到根节点
		 */
		Element rootElement = document.getRootElement();		
		/**
		 * 2.得到第一个p1节点
		 */
		Element firstP1Node = rootElement.element("p1");
		/**
		 * 3.在p1节点下面添加一个节点
		 */
		Element sexNode  = firstP1Node.addElement("sex");
		/**
		 * 4.给sex节点设置文本值
		 */
		sexNode.setText("女");
		/**
		 * 5.回写新节点到内存中
		 */
		//格式化(有缩进效果)
		OutputFormat format = OutputFormat.createPrettyPrint();
		//格式化(没有缩进效果)
		//OutputFormat format = OutputFormat.createCompactFormat();
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/com/dragonsoft/xml/dom4j/person.xml"),format);
		/**
		 * 6.回写内存中的节点到xml文档中
		 */
		xmlWriter.write(document);
		/**
		 * 7.关闭流
		 */
		xmlWriter.close();
	}

	/**  
	 * @Title: selectSecondP1Tag  
	 * @Description: TODO(得到根节点下第二个P2节点中name标签的值)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void selectSecondP1Tag(Document document) {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.获取根节点下所有节点
		 */
		List<Element> elementList = rootElement.elements("p1");
		/**
		 * 3.获取第二个p1节点
		 */
		Element secondP1Node = elementList.get(1);
		/**
		 * 4.获取第二个p1下面的name的值
		 */
		 Element nameTageNode = secondP1Node.element("name");
		 /**
		  * 5.获取name的值
		  */
		 System.out.println("root下第二个p1下name标签的值:"+nameTageNode.getText());
	}

	/**  
	 * @Title: selectFirstP1Tag  
	 * @Description: TODO(得到根节点下第一个P1节点中name标签的值)  
	 * @param document 参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void selectFirstP1Tag(Document document) {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.获取根节点下第一个p1，如果调用element(String tagName)，默认返回根节点下第一个子节点
		 */
		Element firstP1Node = rootElement.element("p1");
		/**
		 * 3.得到第一个p1节点下面的name标签的值
		 */
		String nameTageText = firstP1Node.element("name").getText();
		System.out.println("root下第一个p1下name标签的值:"+nameTageText);
	}

	/**  
	 * @Title: selectAllP1Tag  
	 * @Description: TODO(得到所有的p1标签，然后得到每一个p1标签中name和age子标签的值)  
	 * @param document
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void selectAllP1Tag(Document document) {
		/**
		 * 1.获取根节点
		 */
		Element rootElement = document.getRootElement();
		/**
		 * 2.获取所有的p1节点,使用elements(String tagName)方法
		 */
		List<Element> elements = rootElement.elements("p1");
		//遍历此List，得到每一个Element
		for(Element node:elements){
			//获取每一个Element中name和age属性的值
			Element nameNode = node.element("name");
			Element ageNode = node.element("age");
			System.out.println("name:"+nameNode.getText()+"---"+"age:"+ageNode.getText());
		}
	}

	/**  
	 * @Title: dom4jParseXmlgetDocumentObject  
	 * @Description: TODO(得到xml文档的root节点)  
	 * @return Element    返回类型
	 * @throws  
	 */
	private static Document dom4jParseXmlgetDocumentObject() throws DocumentException {
		/**
		 * 1.创建解析器
		 */
		SAXReader saxReader = new SAXReader();
		/**
		 * 2.得到document
		 */
		Document document = saxReader.read("src/com/dragonsoft/xml/dom4j/person.xml");
		return document;
	}

}
