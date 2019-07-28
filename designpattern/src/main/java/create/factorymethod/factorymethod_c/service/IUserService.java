package create.factorymethod.factorymethod_c.service;

import create.factorymethod.factorymethod_c.domain.User;

public interface IUserService {
    User get(Integer uid);
}
