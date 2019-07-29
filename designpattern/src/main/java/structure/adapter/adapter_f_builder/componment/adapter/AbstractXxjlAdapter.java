package structure.adapter.adapter_f_builder.componment.adapter;

import structure.adapter.adapter_f_builder.domain.Gatzl;
import structure.adapter.adapter_f_builder.domain.Tztg;
import structure.adapter.adapter_f_builder.service.IGatzlService;
import structure.adapter.adapter_f_builder.service.ITztgService;

public class AbstractXxjlAdapter implements IGatzlService,ITztgService {
    @Override
    public void save(Gatzl gatzl) {

    }

    @Override
    public boolean delete(Gatzl gatzl) {
        return false;
    }

    @Override
    public boolean sendMsg(String phoneNumber) {
        return false;
    }

    @Override
    public void save(Tztg tztg) {

    }

    @Override
    public boolean delete(Tztg tztg) {
        return false;
    }

    @Override
    public boolean sendEmail(String email) {
        return false;
    }
}
