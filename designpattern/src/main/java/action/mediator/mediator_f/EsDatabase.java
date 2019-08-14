package action.mediator.mediator_f;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Es数据库,维护了Mysql数据库的引用
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 14:00
 */
public class EsDatabase extends AbstractDatabase{

    private List<String> dataset = new CopyOnWriteArrayList<String>();

    /**Mysql数据库*/
    private MysqlDatabase mysqlDatabase;

    public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
        this.mysqlDatabase = mysqlDatabase;
    }

    /**
     * 给ES数据库添加数据
     * @param data
     */
    @Override
    public void addData(String data) {
        System.out.println("ES 添加数据：" + data);
        this.dataset.add(data);
    }

    /**
     * 把刚才添加的数据同步维护到Mysql数据库中
     * @param data
     */
    @Override
    public void add(String data) {
        addData(data);
        // 维护同步到MySQL的同步作业
        this.mysqlDatabase.addData(data);
    }

    /**
     * ES数据库独有的操作,统计总数据量
     */
    public void count() {
        int count = this.dataset.size();
        System.out.println("- Elasticsearch 统计，目前有 " + count + " 条数据，数据：" + this.dataset.toString());
    }
}
