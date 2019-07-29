package create.abstractfactory.abstractfactory_c.service;

import create.abstractfactory.abstractfactory_c.domain.User;

public interface IUserService {
    User get(Integer uid);
}
