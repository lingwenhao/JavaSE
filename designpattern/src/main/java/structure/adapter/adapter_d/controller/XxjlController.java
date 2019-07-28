package structure.adapter.adapter_d.controller;

import structure.adapter.adapter_d.domain.Xxjl;
import structure.adapter.adapter_d.service.IXxjlService;
import structure.adapter.adapter_d.service.XxjlAdapterService;
import structure.adapter.adapter_d.service.XxjlSerivice;

/***
 * 需求:保存信息交流的同时，发送邮件并且短信提醒
 */
public class XxjlController {
    //多态
    private IXxjlService xxjlService = new XxjlSerivice();
    private IXxjlService xxjlAdapterService = new XxjlAdapterService();

    //@RequestMappng("xxxx")
    public String save(Xxjl xxjl){
        //xxjlService.save(xxjl);
        xxjlAdapterService.save(xxjl);
        return null;
    }

    //@RequestMappng("xxxx")
    public String delete(Xxjl xxjl){
        xxjlService.delete(xxjl);
        return null;
    }
}
