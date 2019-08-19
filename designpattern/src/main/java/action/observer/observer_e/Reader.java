package action.observer.observer_e;

/**
 * 推模型的具体实现者
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 15:01
 */
public class Reader implements Observer{

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(String content) {
        //这是采用推的方式
        System.out.println(name+"收到报纸了，阅读先。内容是==="+content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
