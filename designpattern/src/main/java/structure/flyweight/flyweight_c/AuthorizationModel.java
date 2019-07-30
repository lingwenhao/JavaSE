package structure.flyweight.flyweight_c;

/**
 * @author ronin
 * @version V1.0
 * @desc 描述授权数据的Model
 * @since 2019/7/30 15:00
 */
public class AuthorizationModel {
    /**人员*/
    private String user;
    /**安全实体*/
    private String securityEntity;
    /**权限*/
    private String authority;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
