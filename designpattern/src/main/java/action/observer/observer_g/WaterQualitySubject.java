package action.observer.observer_g;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义水质监测的目标对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 16:15
 */
public abstract class WaterQualitySubject {

    /**
     * 用来保存注册的观察者对象
     */
    protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(WatcherObserver observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void detach(WatcherObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知相应的观察者对象
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     * @return 水质污染的级别
     */
    public abstract int getPolluteLevel();
}
