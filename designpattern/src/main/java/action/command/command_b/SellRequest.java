package action.command.command_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 具体的销售请求
 * @since 2019/8/2 9:03
 */
public class SellRequest implements Order{
    private Request request;

    public SellRequest(Request request){
        this.request = request;
    }

    /**
     * 执行具体的销售请求
     */
    @Override
    public void execute() {
        request.sell();
    }
}
