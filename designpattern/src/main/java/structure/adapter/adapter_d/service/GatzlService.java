package structure.adapter.adapter_d.service;

import structure.adapter.adapter_d.dao.GatzlDao;
import structure.adapter.adapter_d.domain.Gatzl;

public class GatzlService implements IGatzlService{
    private GatzlDao gatzlDao = new GatzlDao();

    @Override
    public void save(Gatzl gatzl) {
        gatzlDao.save(gatzl);
    }

    @Override
    public boolean delete(Gatzl gatzl) {
        return gatzlDao.delete(gatzl);
    }

    @Override
    public boolean sendMsg(String phoneNumber) {
        return gatzlDao.sendMsg(phoneNumber);
    }
}
