package structure.adapter.adapter_f_builder.controller;

import structure.adapter.adapter_f_builder.domain.Xxjl;
import structure.adapter.adapter_f_builder.service.IXxjlService;
import structure.adapter.adapter_f_builder.service.XxjlSerivice;

/***
 * 需求:保存信息交流的同时，发送邮件并且短信提醒
 */
public class XxjlController {
    private IXxjlService xxjlService = new XxjlSerivice();

    //@RequestMappng("xxxx")
    public String save(Xxjl xxjl){
        try {
            xxjlService.save(xxjl);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //@RequestMappng("xxxx")
    public String delete(Xxjl xxjl){
        try {
            xxjlService.delete(xxjl);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
