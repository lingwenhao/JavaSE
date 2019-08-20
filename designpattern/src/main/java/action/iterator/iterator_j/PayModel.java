package action.iterator.iterator_j;

/**
 * 工资描述模型对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/20 9:21
 */
public class PayModel {

    /**
     * 支付工资的人员
     */
    private String userName;

    /**
     * 支付的工资数额
     */
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "userName="+userName+",pay="+pay;
    }
}
