package com.dragonsoft.structure.composite.composite_b;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponment {

    /**
     * 存放的College
     */
    List<OrganizationComponment> univerities = new ArrayList<OrganizationComponment>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponment organizationComponment) {
        univerities.add(organizationComponment);
    }

    @Override
    protected void remove(OrganizationComponment organizationComponment) {
        univerities.remove(organizationComponment);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    /**输出University中所包含的学院*/
    @Override
    public void print() {
        System.out.println("-------------"+getName()+":"+getDesc()+"-------------");
        //遍历
        for(OrganizationComponment univeritiy:univerities){
            univeritiy.print();
        }
    }
}
