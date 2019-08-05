package create.singleton.singleton_b;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 16:46
 */
public class PropertiesUtils {
    public static void read(){
        Properties properties = new Properties();
        try {
            properties.load(PropertiesUtils.class.getResourceAsStream("singleton.properties"));
            System.out.println("name:"+properties.get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
