package structure.adapter.adapter_f_builder.dao;

import structure.adapter.adapter_f_builder.domain.Xxjl;

public class XxjlSjrDao implements IXxjlDao {
    @Override
    public boolean save(Xxjl xxjl) {
        System.out.println("保存收件人接收到的信息交流......");
        return true;
    }
    @Override
    public boolean delete(Xxjl xxjl) {
        System.out.println("删除收件人接受到的信息交流......");
        return true;
    }
}
