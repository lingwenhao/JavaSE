package structure.composite.composite_c;

public abstract class OrganizationComponment {
    private String name;
    private String desc;

    protected void add(OrganizationComponment organizationComponment){
        //默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponment organizationComponment){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponment(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract void print();
}
