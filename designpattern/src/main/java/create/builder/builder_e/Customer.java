package create.builder.builder_e;


public class Customer {
    private String id;
    private String name;
    private String email;
    private Integer age;
    private String hobby;
    private String addess;

    private Customer() {}

    /**
     * 外部构造方法需要私有化
     * @param builder
     */
    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.hobby = builder.hobby;
        this.addess = builder.addess;
    }

    public static final class Builder {
        private String id;
        private String name;
        private String email;
        private Integer age;
        private String hobby;
        private String addess;

        public Builder() {
        }
        public Builder id(String param){
            this.id = param;
            return this;
        }

        public Builder name(String param){
            this.name = param;
            return this;
        }

        public Builder email(String param){
            this.email = param;
            return this;
        }

        public Builder age(Integer param){
            this.age = param;
            return this;
        }

        public Builder hobby(String param){
            this.hobby = param;
            return this;
        }

        public Builder addess(String param){
            this.addess = param;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", addess='" + addess + '\'' +
                '}';
    }
}
