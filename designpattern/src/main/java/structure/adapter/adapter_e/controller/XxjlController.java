package structure.adapter.adapter_e.controller;

import structure.adapter.adapter_e.domain.Xxjl;
import structure.adapter.adapter_e.service.IXxjlService;
import structure.adapter.adapter_e.service.XxjlSerivice;

/***
 * 需求:保存信息交流的同时，发送邮件并且短信提醒
 */
public class XxjlController {
    //多态
    private IXxjlService xxjlService = new XxjlSerivice();


    //@RequestMappng("xxxx")
    public String save(Xxjl xxjl){
        xxjlService.save(xxjl);
        return null;
    }

    //@RequestMappng("xxxx")
    public String delete(Xxjl xxjl){
        xxjlService.delete(xxjl);
        return null;
    }
}
