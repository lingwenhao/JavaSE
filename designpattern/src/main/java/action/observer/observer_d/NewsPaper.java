package action.observer.observer_d;

/**
 * 报纸对象，具体的目标实现
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 13:48
 */
public class NewsPaper extends Subject{

    /**
     * 报纸的具体内容
     */
    private String content;

    /**
     * 获取报纸的具体内容
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 示意，设置报纸的具体内容，相当于要出版报纸了
     * 注意:一般是设置完状态之后才通知各个观察者
     * @param content 报纸的具体内容
     */
    public void setContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者,拉模型
        notifyObservers();
    }
}
