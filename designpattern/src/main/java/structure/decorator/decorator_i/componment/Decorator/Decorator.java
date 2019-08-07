package structure.decorator.decorator_i.componment.Decorator;

import structure.decorator.decorator_i.service.IGoodsSaleService;

/**
 * 抽象的装饰者
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 9:44
 */
public abstract class Decorator implements IGoodsSaleService {

    /**
     * 持有被装饰的组件对象
     */
    protected IGoodsSaleService goodsSaleService;

    /**
     * 通过构造方法传入被装饰的对象
     * @param goodsSaleService 被装饰的对象
     */
    public Decorator(IGoodsSaleService goodsSaleService){
        this.goodsSaleService = goodsSaleService;
    }
}
