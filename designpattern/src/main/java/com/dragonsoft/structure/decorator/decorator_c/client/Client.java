package com.dragonsoft.structure.decorator.decorator_c.client;

import com.dragonsoft.structure.decorator.decorator_c.controller.XctbController;
import com.dragonsoft.structure.decorator.decorator_c.domain.Xctb;

import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 14:33
 */
public class Client{

    public static void main(String[] args) {
        XctbController xctbController = new XctbController();
        List<Xctb> list = xctbController.list();
        System.out.println(list);
    }
}
