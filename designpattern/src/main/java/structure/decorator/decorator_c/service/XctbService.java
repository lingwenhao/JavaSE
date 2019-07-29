package structure.decorator.decorator_c.service;

import structure.decorator.decorator_c.dao.XctbDao;
import structure.decorator.decorator_c.domain.Xctb;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 14:09
 */
public class XctbService implements IXctbService{
    //@Resource
    private XctbDao xctbDao = new XctbDao();

    @Override
    public List<Xctb> list() throws Exception{
        return xctbDao.list();
    }
}
