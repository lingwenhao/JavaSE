package action.mediator.mediator_f;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/14 16:30
 */
public class Client {
    public static void main(String[] args) {
        MysqlDatabase mysqlDatabase = new MysqlDatabase();
        RedisDatabase redisDatabase = new RedisDatabase();
        EsDatabase esDatabase = new EsDatabase();

        mysqlDatabase.setRedisDatabase(redisDatabase);
        mysqlDatabase.setEsDatabase(esDatabase);
        esDatabase.setMysqlDatabase(mysqlDatabase);

        System.out.println("\n---------mysql 添加数据 1，将同步到Redis和ES中-----------");
        mysqlDatabase.add("1");

        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------Redis添加数据 2，将不同步到其它数据库-----------");
        redisDatabase.add("2");

        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------ES 添加数据 3，只同步到 Mysql-----------");
        esDatabase.add("3");

        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();
    }
}
