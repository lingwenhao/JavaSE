package expand.designpattern.filter.filter_a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc 筛选赠送免费生日提醒的目标用户过滤器
 * @since 2019/7/29 15:56
 */
public class BirthdayRemindFilter implements Filter {
    /**
     * @param consumers 消费者
     * @return
     */
    @Override
    public List<Consumer> filter(List<Consumer> consumers) {
        List<Consumer> cs = new ArrayList<Consumer>();
        //星级为5星级以上 赠送生日提醒
        for (Consumer c : consumers) {
            if (c.getStar() >= 5) {
                cs.add(c);
            }
        }
        return cs;
    }
}
