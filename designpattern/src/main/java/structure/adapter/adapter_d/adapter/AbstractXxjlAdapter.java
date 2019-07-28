package structure.adapter.adapter_d.adapter;

import structure.adapter.adapter_d.domain.Xxjl;
import structure.adapter.adapter_d.service.IXxjlService;

public class AbstractXxjlAdapter implements IXxjlService{
    @Override
    public void save(Xxjl xxjl) {

    }

    @Override
    public boolean delete(Xxjl xxjl) {
        return false;
    }
}
