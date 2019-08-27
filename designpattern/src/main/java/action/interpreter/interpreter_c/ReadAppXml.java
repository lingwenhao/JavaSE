package action.interpreter.interpreter_c;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 读取配置文件
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 13:42
 */
public class ReadAppXml {

    /**
     * 读取配置文件内容
     * @param filePathName 配置文件的路径和文件名
     * @throws Exception
     */
    public void read(String filePathName)throws Exception{
        Document doc = null;
        //建立一个解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //获得一个DocumentBuilder对象，这个对象代表了具体的DOM解析器
        DocumentBuilder builder=factory.newDocumentBuilder();
        //得到一个表示XML文档的Document对象
        doc=builder.parse(filePathName);
        //去掉XML中作为格式化内容的空白而映射在DOM树中的Text Node对象
        doc.normalize();

        //获取jdbc的配置值
        NodeList jdbc = doc.getElementsByTagName("jdbc");
        //只有一个jdbc,获取jdbc中的驱动类的名称
        NodeList driverClassNode = ((Element)jdbc.item(0)).getElementsByTagName("driver-class");
        String driverClass = driverClassNode.item(0).getFirstChild().getNodeValue();
        System.out.println("driverClass=="+driverClass);

        //同理获取url、user、password等的值
        NodeList urlNode = ((Element)jdbc.item(0)).getElementsByTagName("url");
        String url=urlNode.item(0).getFirstChild().getNodeValue();
        System.out.println("url=="+url);

        NodeList userNode = ((Element)jdbc.item(0)).getElementsByTagName("user");
        String user = userNode.item(0).getFirstChild().getNodeValue();
        System.out.println("user=="+user);

        NodeList passwordNode = ((Element)jdbc.item(0)).getElementsByTagName("password");
        String password = passwordNode.item(0).getFirstChild().getNodeValue();
        System.out.println("password=="+password);

        //获取application-xml
        NodeList applicationXmlNode = doc.getElementsByTagName("application-xml");
        String applicationXml = applicationXmlNode.item(0).getFirstChild().getNodeValue();
        System.out.println("applicationXml=="+applicationXml);

    }
}
