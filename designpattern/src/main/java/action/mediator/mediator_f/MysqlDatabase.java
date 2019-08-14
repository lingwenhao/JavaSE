package action.mediator.mediator_f;


import java.util.ArrayList;
import java.util.List;

/**
 * Mysql数据库,维护了Redis和Es数据库的引用
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 13:59
 */
public class MysqlDatabase extends AbstractDatabase{

    private List<String> dataset = new ArrayList<String>();

    /**Redis数据库*/
    private RedisDatabase redisDatabase;
    /**Es数据库*/
    private EsDatabase esDatabase;

    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public void setEsDatabase(EsDatabase esDatabase) {
        this.esDatabase = esDatabase;
    }

    /**
     * 给Mysql数据库添加数据
     * @param data
     */
    @Override
    public void addData(String data) {
        System.out.println("Mysql 添加数据：" + data);
        this.dataset.add(data);
    }

    /**
     * 把刚才添加的数据同步维护到Redis数据库中
     * 把刚才添加的数据同步维护到Elasticsearch中
     * @param data
     */
    @Override
    public void add(String data) {
        addData(data);
        //维护同步到Redis的同步作业
        this.redisDatabase.addData(data);
        //维护同步到Elasticsearch的同步作业
        this.esDatabase.addData(data);
    }

    /**
     * Mysql数据库独有的查询功能
     */
    public void select() {
        System.out.println("- Mysql 查询，数据：" + this.dataset.toString());
    }
}
