package structure.decorator.decorator_i.service;

import structure.decorator.decorator_i.domain.SaleModel;

/**
 * 销售商品的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 9:41
 */
public interface IGoodsSaleService {

    /**
     * 保存销售信息，本来销售数据应该是多条，太麻烦了，为了演示，简单点
     * @param user 操作人员
     * @param customer 客户
     * @param saleModel 销售数据
     * @return 是否保存成功
     */
    boolean sale(String user,String customer,SaleModel saleModel);

}
