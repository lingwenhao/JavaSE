package structure.decorator.decorator_i.componment.Decorator;

import structure.decorator.decorator_i.domain.SaleModel;
import structure.decorator.decorator_i.service.IGoodsSaleService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现日志装饰器
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 9:48
 */
public class LogDecorator extends Decorator{
    public LogDecorator(IGoodsSaleService goodsSaleService) {
        super(goodsSaleService);
    }

    /**
     * 保存销售信息，本来销售数据应该是多条，太麻烦了，为了演示，简单点
     *
     * @param user      操作人员
     * @param customer  客户
     * @param saleModel 销售数据
     * @return 是否保存成功
     */
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //执行业务功能
        boolean f = this.goodsSaleService.sale(user, customer, saleModel);
        //在执行业务功能过后，记录日志
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("日志记录："+user+"于"+df.format(new Date())+"时保存了一条销售记录，客户是"+customer+",购买记录是"+saleModel);
        return f;
    }
}
