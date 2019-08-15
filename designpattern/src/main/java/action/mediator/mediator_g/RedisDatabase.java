package action.mediator.mediator_g;

import java.util.LinkedList;
import java.util.List;

/**
 * Redis 数据库（具体同事类）
 * @author ronin
 * @version V1.0
 * @since 2019/8/15 8:36
 */
public class RedisDatabase extends AbstractDatabase {
    private List<String> dataset = new LinkedList<String>();

    public RedisDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("Redis 添加数据：" + data);
        this.dataset.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 数据同步作业交给中介者管理
        this.mediator.sync(AbstractDatabase.REDIS, data);
    }

    public void cache() {
        System.out.println("Redis 缓存的数据：" + this.dataset.toString());
    }
}
