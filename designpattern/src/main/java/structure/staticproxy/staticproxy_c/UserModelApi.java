package structure.staticproxy.staticproxy_c;

/**
 * 定义用户数据对象的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/15 9:10
 */
public interface UserModelApi {
    String getUserId();
    void setUserId(String userId);
    String getName();
    void setName(String name);
    String getDepId();
    void setDepId(String depId);
    String getSex();
    void setSex(String sex);
}
