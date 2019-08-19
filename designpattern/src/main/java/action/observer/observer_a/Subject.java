package action.observer.observer_a;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象接口(被观察者接口):它知道它的观察者，并提供注册和删除观察者的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 13:37
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
