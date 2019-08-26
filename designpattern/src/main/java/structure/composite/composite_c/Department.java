package structure.composite.composite_c;

public class Department extends OrganizationComponment {

    public Department(String name, String desc) {
        super(name, desc);
    }

    //注意:add()和remove()方法就不需要再重写了，因为Department是叶子节点，不用去管理子节点了

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
        System.out.println(getName()+":"+getDesc());
    }
}