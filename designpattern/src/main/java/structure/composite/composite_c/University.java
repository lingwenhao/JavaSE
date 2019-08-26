package structure.composite.composite_c;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponment {

    /**
     * 存放的College
     */
    List<OrganizationComponment> collegeList = new ArrayList<OrganizationComponment>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponment organizationComponment) {
        collegeList.add(organizationComponment);
    }

    @Override
    protected void remove(OrganizationComponment organizationComponment) {
        collegeList.remove(organizationComponment);
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
        for(OrganizationComponment collge:collegeList){
            collge.print();
        }
    }
}
