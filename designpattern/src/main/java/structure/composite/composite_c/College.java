package structure.composite.composite_c;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponment {

    /**
     * 存放的department
     */
    List<OrganizationComponment> deparmentList = new ArrayList<OrganizationComponment>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponment organizationComponment) {
        deparmentList.add(organizationComponment);
    }

    @Override
    protected void remove(OrganizationComponment organizationComponment) {
        deparmentList.remove(organizationComponment);
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
        for(OrganizationComponment department:deparmentList){
            department.print();
        }
    }
}