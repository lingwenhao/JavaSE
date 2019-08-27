package action.responsibility.responsibility_d;

/**
 * 部门经理
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 18:03
 */
public class DepManager extends Handler{

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //部门经理的权限只能在1000以内
        if(fee < 1000){
            //为了测试，简单点，只同意小李申请的
            if("小李".equals(user)){
                str = "部门经理同意"+user+"聚餐费用"+fee+"元的请求";
            }else{
                //其它人一律不同意
                str = "部门经理不同意"+user+"聚餐费用"+fee+"元的请求";
            }
            return str;
        }else{
            //超过1000，继续传递给级别更高的人处理
            if(this.successor!=null){
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
