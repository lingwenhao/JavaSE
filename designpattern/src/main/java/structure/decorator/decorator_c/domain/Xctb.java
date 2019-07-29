package structure.decorator.decorator_c.domain;

import create.builder.builder_e.Customer;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 14:10
 */
public class Xctb {
    private String id;
    private String wzbt;
    private String wznr;

    public Xctb(){

    }

    private Xctb(Builder builder) {
        this.id = builder.id;
        this.wzbt = builder.wzbt;
        this.wznr = builder.wznr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWzbt() {
        return wzbt;
    }

    public void setWzbt(String wzbt) {
        this.wzbt = wzbt;
    }

    public String getWznr() {
        return wznr;
    }

    public void setWznr(String wznr) {
        this.wznr = wznr;
    }

    @Override
    public String toString() {
        return "Xctb{" +
                "id='" + id + '\'' +
                ", wzbt='" + wzbt + '\'' +
                ", wznr='" + wznr + '\'' +
                '}';
    }

    public static final class Builder{
        private String id;
        private String wzbt;
        private String wznr;

        public Builder() {
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder wzbt(String wzbt){
            this.wzbt = wzbt;
            return this;
        }
        public Builder wznr(String wznr){
            this.wznr = wznr;
            return this;
        }

        public Xctb build(){
            return new Xctb(this);
        }
    }
}
