package action.strategy.strategy_e.service;

import action.strategy.strategy_e.dao.UserDao;

import java.io.IOException;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 9:07
 */
public class UserService implements IUserService{

    private UserDao userDo = new UserDao();

    /**注入记录日志的Service:默认数据库*/
    private ILogService logger = new LogServiceDb();

    /**
     * 保存
     * @param msg
     */
    @Override
    public void save(String msg) {
        try {
            userDo.save(msg);
            logger.log();
        } catch (IOException e) {
            logger = new LogServiceFile();
            logger.log();
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
