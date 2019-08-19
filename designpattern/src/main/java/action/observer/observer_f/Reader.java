package action.observer.observer_f;

import java.util.Observable;
import java.util.Observer;

/**
 * 真正的读者，为了简单就描述一下姓名
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 15:16
 */
public class Reader implements Observer{

    /**
     * 读者的姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object obj) {
        //这是采用推的方式
        System.out.println(name+"收到报纸了，阅读先。目标推过来的内容是==="+obj);
        //这是获取拉的数据
        System.out.println(name+"收到报纸了，阅读先。主动到目标对象去拉的内容是==="+((NewsPaper)o).getContent());
    }
}
