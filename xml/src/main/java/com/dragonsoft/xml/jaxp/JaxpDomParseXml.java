package com.dragonsoft.xml.jaxp;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**  
 * 使用jaxp的Dom方式解析xml文件,jaxp增、删、改操作对格式化的支持很差
 * @author ronin  
 * @date 2019年3月2日  
 */
public class JaxpDomParseXml {
	/**
	 * dom方式解析xml:
	 * 		根据xml的层级结构在内存中分配一个树，把html的标签、属性、文本都封装成对象
	 * 缺点:如果xml文档过大，容易造成内存溢出
	 * 优点：很方便的实现增删改操作
	 */
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		/**
		 * 使用jaxp的dom方式解析xml,获取document对象
		 */
		Document document = domParseXmlgetDocumentObject();
		/**
		 * 获取xml回写工厂对象
		 */
		Transformer transfomer = getTransfomer();
		/**
		 * 获取xml中所有的节点
		 */
		//selectAllNodes(document);
		/**
		 * 给第一个节点下面增加一个新的节点,不支持格式化插入
		 */
		//addNode(document,transfomer);
		/**
		 * 修改xml节点
		 */
		//editNode(document,transfomer);
		/**
		 * 删除xml节点
		 */
		//deleteNode(document,transfomer);
		/**
		 * 递归遍历xml节点
		 */
		listNode(document);
	}

	/**  
	 * @param document    参数
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void listNode(Node node) {
		//判断一下,如果是节点类型,就打印该节点名称
		if(node.getNodeType() == Node.ELEMENT_NODE){
			System.out.println("NodeType:"+node.getNodeType()+"---"
					+"Node.ELEMENT_NODE:"+Node.ELEMENT_NODE+"---"
					+"NodeName:"+node.getNodeName()+"---"
					+"NodeValue:"+node.getNodeValue());
		}
		/**
		 * 1.获取一层子节点
		 */
		NodeList childNodes = node.getChildNodes();
		/**
		 * 2.遍历该层子节点
		 */
		for(int i=0; i<childNodes.getLength(); i++){
			Node childNode = childNodes.item(i);
			System.out.println("Node中的文本值:"+childNode.getTextContent());
			//如果再有子节点,递归调用
			listNode(childNode);
		}
		
	}

	/**
	 * @throws TransformerException   
	 * @param document
	 * @param transfomer    参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void deleteNode(Document document, Transformer transfomer) throws TransformerException {
		/**
		 * 1.获取所有的节点,然后获取第一个节点
		 */
		Node node = document.getElementsByTagName("name").item(0);
		/**
		 * 2.获取node节点的父节点
		 */
		Node nodeParent = node.getParentNode();
		/**
		 * 3.使用删除获取到的name节点
		 */
		Node removeChild = nodeParent.removeChild(node);
		System.out.println(removeChild);
		/**
		 * 4.把内存中新创建的节点会回写到xml文件中
		 */
		transfomer.transform(new DOMSource(document), new StreamResult("src/com/dragonsoft/jaxp/person.xml"));
	}

	/**
	 * @throws TransformerException   
	 * @param document
	 * @param transfomer    参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void editNode(Document document, Transformer transfomer) throws TransformerException {
		/**
		 * 1.获取所有的节点,然后获取第一个节点
		 */
		Node node = document.getElementsByTagName("name").item(0);
		/**
		 * 2.修改节点的值
		 */
		node.setTextContent("这个值被我修改了!");
		/**
		 * 3.把内存中新创建的节点会回写到xml文件中
		 */
		transfomer.transform(new DOMSource(document), new StreamResult("src/com/dragonsoft/jaxp/person.xml"));
	}

	/**  
  	 * @Title: getTransfomer  
	 * @param TransformerFactoryConfigurationError
	 * @param TransformerConfigurationException    参数  
	 * @return void    返回类型  
	 * @throws  
	 */
	private static Transformer getTransfomer() throws TransformerFactoryConfigurationError, TransformerConfigurationException {
		/**
		 * 1.获取xml回写工厂
		 */
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		/**
		 * 2.通过工厂获取xml回写工厂对象
		 */
		return transformerFactory.newTransformer();
	}

    /**
	 * @throws TransformerException  
	 * @Title: addNode  
	 * @param document    参数
	 * @param transfomer    完成回写xml的对象 
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void addNode(Document document, Transformer transfomer) throws TransformerException {
		/**
		 * 1.获取所有的节点,然后获取第一个节点
		 */
		Node node = document.getElementsByTagName("name").item(0);
		/**
		 * 2.创建新的节点
		 */
		Element newNode = document.createElement("sex");
		/**
		 * 3.创建文本值,并把文本值加到新创建的节点中
		 */
		Text newNodeText = document.createTextNode("女");
		newNode.appendChild(newNodeText);
		/**
		 * 4.把新创建的节点加入到第一个节点下面
		 */
		node.appendChild(newNode);
		/**
		 * 5.把内存中新创建的节点会回写到xml文件中
		 */
		transfomer.transform(new DOMSource(document), new StreamResult("src/com/dragonsoft/jaxp/person.xml"));
	}

	/**  
	 * @param document    参数
	 * @return void    返回类型  
	 * @throws  
	 */
	private static void selectAllNodes(Document document) {
		/**
		 * 1.根据xml的标签名获取节点集合
		 */
		NodeList nodes = document.getElementsByTagName("name");
		/**
		 * 2.遍历该节点集合
		 */
		for(int i=0; i<nodes.getLength(); i++){
			Node node = nodes.item(i);
			/**
			 * 3.获取该节点中的文本值
			 */
			String nodeContentText = node.getTextContent();
			System.out.println(nodeContentText);
		}
		
	}

	/**
	 * @param ParserConfigurationException
	 * @param SAXException
	 * @param IOException    参数  
	 * @return Document    返回类型  
	 * @throws
	 */
	private static Document domParseXmlgetDocumentObject() throws ParserConfigurationException, SAXException, IOException {
		/**
		 * 1.创建解析器工厂 
		 */
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		/**
		 * 2.创建解析器 
		 */
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		/**
		 * 3.使用解析器解析xml文档
		 */
		return documentBuilder.parse("src/com/dragonsoft/jaxp/person.xml");
	}
}
