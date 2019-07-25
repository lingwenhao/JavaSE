package com.dragonsoft.structure.composite.composite_b;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponment {

    /**
     * 存放的department
     */
    List<OrganizationComponment> colleges = new ArrayList<OrganizationComponment>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponment organizationComponment) {
        colleges.add(organizationComponment);
    }

    @Override
    protected void remove(OrganizationComponment organizationComponment) {
        colleges.remove(organizationComponment);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    /**
     * 输出College中所包含的学院
     */
    @Override
    public void print() {
        System.out.println("-------------"+getName()+":"+getDesc()+"-------------");
        //遍历
        for(OrganizationComponment college:colleges){
            college.print();
        }
    }
}