package create.singleton.singleton_c;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用单例解决Properties文件加载问题
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 16:46
 */
public class PropertiesUtils {

    private static final PropertiesUtils PROPERTIES_UTILS = new PropertiesUtils();
    private PropertiesUtils(){

    }

    /**
     * 获取单例类的实例
     * @return
     */
    public static PropertiesUtils getInstance(){
        return PROPERTIES_UTILS;
    }

    public void read(){
        Properties properties = new Properties();
        try {
            properties.load(PropertiesUtils.class.getResourceAsStream("singleton.properties"));
            System.out.println("name:"+properties.get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
