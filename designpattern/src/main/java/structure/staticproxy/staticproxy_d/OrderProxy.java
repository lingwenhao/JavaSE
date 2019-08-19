package structure.staticproxy.staticproxy_d;

/**
 * 订单代理对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/19 10:50
 */
public class OrderProxy implements OrderApi{

    /**
     * 持有被代理的具体的目标对象
     */
    private Order order=null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体的目标对象
     */
    public OrderProxy(Order realSubject){
        this.order = realSubject;
    }


    @Override
    public void setProductName(String productName,String user) {
        //控制访问权限，只有创建订单的人员才能够修改
        if(user!=null && user.equals(this.getOrderUser())){
            order.setProductName(productName, user);
        }else{
            System.out.println("对不起"+user+"，您无权修改订单中的产品名称。");
        }
    }

    @Override
    public void setOrderNum(int orderNum,String user) {
        //控制访问权限，只有创建订单的人员才能够修改
        if(user!=null && user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum, user);
        }else{
            System.out.println("对不起"+user+"，您无权修改订单中的订购数量。");
        }
    }

    @Override
    public void setOrderUser(String orderUser,String user) {
        //控制访问权限，只有创建订单的人员才能够修改
        if(user!=null && user.equals(this.getOrderUser())){
            order.setOrderUser(orderUser, user);
        }else{
            System.out.println("对不起"+user+"，您无权修改订单中的订购人。");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public String toString(){
        return "productName="+this.getProductName()+",orderNum="+this.getOrderNum()+",orderUser="+this.getOrderUser();
    }
}
