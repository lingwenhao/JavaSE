package action.strategy.strategy_e.controller;

import action.strategy.strategy_e.service.IUserService;
import action.strategy.strategy_e.service.UserService;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 9:05
 */
public class UserController {
    private IUserService userService = new UserService();

    public void save(String msg) {
        userService.save(msg);
    }
}
