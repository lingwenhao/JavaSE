package structure.flyweight.flyweight_c;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ronin
 * @version V1.0
 * @desc 模拟数据库:可以提供权限相关数据
 * @since 2019/7/30 15:04
 */
public class DataFactory {


    /**存放权限数据*/
    public static Collection<String> authorityInfos = new ArrayList<>();

    /**
     * 返回所有的权限数据
     * @return
     */
    public static Collection<String> getAuthorityInfos(){
        return authorityInfos = new ArrayList(){{
            add("张三,人员列表,查看");
            add("李四,人员列表,查看");
            add("李四,薪资数据,查看");
            add("李四,薪资数据,修改");
            //增加更多的授权数据
            for(int i=0;i<3;i++){
                add("张三"+i+",人员列表,查看");
            }
        }};
    }
}
