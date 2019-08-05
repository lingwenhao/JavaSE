package action.strategy.strategy_e.dao;

import java.io.IOException;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 9:07
 */
public class UserDao {
    public void save(String msg) throws IOException {
        System.out.println("把数据: "+msg+" 保存到数据库......");
        //模拟抛出一个IO异常
        throw new IOException();
    }
}
