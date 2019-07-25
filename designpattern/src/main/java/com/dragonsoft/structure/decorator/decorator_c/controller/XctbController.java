package com.dragonsoft.structure.decorator.decorator_c.controller;

import com.dragonsoft.structure.decorator.decorator_c.domain.Xctb;
import com.dragonsoft.structure.decorator.decorator_c.service.IXctbService;
import com.dragonsoft.structure.decorator.decorator_c.service.XctbService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 14:08
 */
public class XctbController {
    //@Resource
    private IXctbService xctbService = new XctbService();

    /**
     * 查询列表，返回一个json串
     * @return
     */
    //@ResponseBody
    //@RequestMaping(value="")
    public List<Xctb> list(){
        List<Xctb> list = null;
        try{
            list = xctbService.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
