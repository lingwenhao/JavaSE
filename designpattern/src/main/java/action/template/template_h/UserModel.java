package action.template.template_h;

/**
 * 描述用户信息的数据模型
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 11:36
 */
public class UserModel {

    private String uuid;
    private String name;
    private String pwd;
    private Integer age;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


