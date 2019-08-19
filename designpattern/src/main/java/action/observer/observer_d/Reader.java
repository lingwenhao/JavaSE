package action.observer.observer_d;

/**
 * 真正的读者，为了简单就描述一下姓名
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 13:51
 */
public class Reader implements Observer{

    /**
    * 读者的姓名
    */
    private String name;

    @Override
    public void update(Subject subject) {
        System.out.println(name+"收到报纸了，阅读先。内容是==="+((NewsPaper)subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
