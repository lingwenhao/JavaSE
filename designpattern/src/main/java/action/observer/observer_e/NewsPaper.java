package action.observer.observer_e;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 15:04
 */
public class NewsPaper extends Subject{

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者,推模型
        notifyObservers(content);
    }
}
