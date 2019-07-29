package structure.flyweight.flyweight_a;

public class ConcreteWebSite implements WebSite{

    /**
     * 网站发布的形式
     * 共享的内部状态
     */
    private String type= "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为:"+type+",使用者是:"+user.getName());
    }
}
