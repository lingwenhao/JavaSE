package create.builder.builder_e;

public class Client {
    public static void main(String[] args) {
        //非Builder模式
        //Customer customer1 = new Customer("00001", "test01", "test01.@qq.com", 18, "运动", "中国");
        //System.out.println(customer1);
        //Builder模式
        Customer.Builder builder = new Customer.Builder();
        //链式风格
        Customer customer2 = builder.id("00002")
                .name("test02")
                .email("test02@qq.com")
                .age(28)
                .hobby("跑步")
                .addess("西部地区")
                .build();
        System.out.println(customer2);
    }
}
