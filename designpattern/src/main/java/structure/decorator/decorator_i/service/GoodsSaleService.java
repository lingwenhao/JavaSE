package structure.decorator.decorator_i.service;

import structure.decorator.decorator_i.domain.SaleModel;

/**
 * 商品销售类
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 9:43
 */
public class GoodsSaleService implements IGoodsSaleService {

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
        return false;
    }
}
