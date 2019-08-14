package action.mediator.mediator_f;

import java.util.LinkedList;
import java.util.List;

/**
 * Redis数据库,不维护其他数据库的引用
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 14:00
 */
public class RedisDatabase extends AbstractDatabase{
    private List<String> dataset = new LinkedList<String>();

    @Override
    public void addData(String data) {
        System.out.println("Redis 添加数据：" + data);
        this.dataset.add(data);
    }

    @Override
    public void add(String data) {
        // 不同步到其它数据库
        addData(data);
    }

    /**
     * Redis独有的缓存功能
     */
    public void cache() {
        System.out.println("- Redis 缓存的数据：" + this.dataset.toString());
    }
}
