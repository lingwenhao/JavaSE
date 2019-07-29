package structure.flyweight.flyweight_a;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂
 */
public class WebSiteFactory {

    /**
     * 集合：重当池的作用
     */
    private Map<String,ConcreteWebSite> pool = new HashMap<String,ConcreteWebSite>();

    public WebSite getWebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    /**
     * 获取网站分类总数，池中有多少个类型的网站
     * @return
     */
    public int getWbSiteCount(){
        return pool.size();
    }
}
