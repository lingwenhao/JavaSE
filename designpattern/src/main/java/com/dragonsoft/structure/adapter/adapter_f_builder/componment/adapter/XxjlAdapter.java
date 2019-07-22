package com.dragonsoft.structure.adapter.adapter_f_builder.componment.adapter;

import com.dragonsoft.structure.adapter.adapter_f_builder.dao.*;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Gatzl;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Tztg;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;
import com.dragonsoft.structure.adapter.adapter_f_builder.service.IGatzlService;
import com.dragonsoft.structure.adapter.adapter_f_builder.service.ITztgService;
import com.dragonsoft.structure.adapter.adapter_f_builder.service.IXxjlService;

public class XxjlAdapter implements IXxjlService {
    //发件人
    private IXxjlDao xxjlFjrDao = new XxjlFjrDao();
    //收件人
    private IXxjlDao xxjlSjrDao = new XxjlSjrDao();
    //Openfire
    private XxjlOpenfireDao xxjlOpenfireDao = new XxjlOpenfireDao();
    //公安厅指令Dao
    private GatzlDao gatzlDao = new GatzlDao();
    //通知通告Dao
    private TztgDao tztgDao = new TztgDao();

    @Override
    public void save(Xxjl xxjl) throws Exception {
        //保存发件人
        xxjlFjrDao.save(xxjl);
        //保存收件人
        xxjlSjrDao.save(xxjl);
        //openfire发送通知
        xxjlOpenfireDao.sendXxjlNotice(xxjl);
        //发送短信
        gatzlDao.sendMsg("123456789");
        //发送邮件
        tztgDao.sendEmail("123@qq.com");
    }

    @Override
    public void delete(Xxjl xxjl) throws Exception {
        //删除发件人
        xxjlFjrDao.delete(xxjl);
        //删除收件人
        xxjlSjrDao.delete(xxjl);
        //openfire发送通知
        xxjlOpenfireDao.sendXxjlNotice(xxjl);
        //发送短信
        gatzlDao.sendMsg("123456789");
        //发送邮件
        tztgDao.sendEmail("123@qq.com");
    }
}
