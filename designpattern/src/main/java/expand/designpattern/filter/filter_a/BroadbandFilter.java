package expand.designpattern.filter.filter_a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc 筛选赠送100M移动宽带一年的目标用户的过滤器
 * @since 2019/7/29 15:53
 */
public class BroadbandFilter implements Filter {
    /**
     * @param consumers 消费者
     * @return
     */
    @Override
    public List<Consumer> filter(List<Consumer> consumers) {
        List<Consumer> cs = new ArrayList<>();
        // 手机套餐为138以上 赠送移动宽带100M一年
        for (Consumer c : consumers) {
            if (c.getCombos() >= 138) {
                cs.add(c);
            }
        }
        return cs;
    }
}
