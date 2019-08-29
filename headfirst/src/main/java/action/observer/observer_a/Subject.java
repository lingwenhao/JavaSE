package action.observer.observer_a;

/**
 * 主题
 * @author ronin
 * @version V1.0
 * @since 2019/8/29 11:25
 */
public interface Subject {

    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeOberver(Observer o);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers();
}
