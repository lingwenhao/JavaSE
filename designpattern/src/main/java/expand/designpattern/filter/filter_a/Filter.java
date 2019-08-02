package expand.designpattern.filter.filter_a;

import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc 抽象的过滤器
 * @since 2019/7/29 15:52
 */
public interface Filter {
    /**
     *
     * @param consumers 消费者
     * @return
     */
    List<Consumer> filter(List<Consumer> consumers);
}