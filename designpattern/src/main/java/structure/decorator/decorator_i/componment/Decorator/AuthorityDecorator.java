package structure.decorator.decorator_i.componment.Decorator;


import structure.decorator.decorator_i.domain.SaleModel;
import structure.decorator.decorator_i.service.IGoodsSaleService;

/**
 * 权限校验装饰者
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 9:46
 */
public class AuthorityDecorator extends Decorator{

    public AuthorityDecorator(IGoodsSaleService goodsSaleService) {
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
        if("张三".equals(user)){
            System.out.println("对不起"+user+"，你没有保存销售单的权限");
            return false;
        }else{
            return this.goodsSaleService.sale(user,customer,saleModel);
        }
    }
}
