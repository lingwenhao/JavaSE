package action.observer.observer_i;

/**
 * 英雄类
 * @author ronin
 * @version V1.0
 * @since 2019/8/30 10:53
 */
public class Hero extends Subject implements Observer{

    /**英雄名称*/
    private String heroName;

    /**英雄位置*/
    private Position position;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Hero(String heroName, Position position) {
        this.heroName = heroName;
        this.position = position;
    }

    /**
     * 模拟英雄进行移动
     */
    public void move(){
        this.position.setX(this.getPosition().getX()+3);
        this.position.setY(this.getPosition().getY()+3);
        //通知所有的接受者
        notifyObserver(this);
    }

    /**
     * @param subject 目标对象
     * @param observer 观察者
     */
    @Override
    public void update(Subject subject,Observer observer) {
        System.out.println(((Hero)subject).getHeroName()+"位置发生了改变,"+((Hero)observer).heroName+"收到了通知:");
        System.out.println(((Hero)subject).heroName+"当前所处位置:"+((Hero)subject).getPosition().getX()+","+((Hero)subject).getPosition().getY());
    }
}
