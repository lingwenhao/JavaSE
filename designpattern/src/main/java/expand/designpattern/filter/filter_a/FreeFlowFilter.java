package expand.designpattern.filter.filter_a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc 筛选赠送10G移动流量的目标用户过滤器
 * @since 2019/7/29 15:55
 */
public class FreeFlowFilter implements Filter {
    /**
     * @param consumers 消费者
     * @return
     */
    @Override
    public List<Consumer> filter(List<Consumer> consumers) {
        List<Consumer> cs = new ArrayList<Consumer>();
        // 在网年份大于5年 免费赠送10G移动流量
        for (Consumer c : consumers) {
            if (c.getExistsYears() >= 5) {
                cs.add(c);
            }
        }
        return cs;
    }
}
