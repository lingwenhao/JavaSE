package expand.designpattern.filter.filter_a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 15:59
 */
public class Client {
    public static void main(String[] args) {
        Consumer zhangft = new Consumer("张奉天", 138, 5, 5);
        Consumer ruiBo = new Consumer("芮博", 238, 2, 5);
        Consumer zhongJj = new Consumer("仲军军", 10, 4, 1);

        List<Consumer> cs = new ArrayList<>();
        cs.add(zhangft);
        cs.add(ruiBo);
        cs.add(zhongJj);

        //筛选赠送100M移动宽带一年的目标用户的过滤器
        Filter broadbandFilter = new BroadbandFilter();
        //筛选赠送10G移动流量的目标用户过滤器
        Filter freeFlowFilter = new FreeFlowFilter();
        //筛选赠送免费生日提醒的目标用户过滤器
        Filter birthdayRemindFilter = new BirthdayRemindFilter();

        System.out.println("免费赠移动100M宽带一年的用户(手机套餐为138及以上):");
        List<Consumer> broadband = broadbandFilter.filter(cs);
        printList(broadband, "移动宽带");
        System.out.println("免费赠送移动流量10G的用户(在网年份大于5年 ):");
        List<Consumer> freeFlow = freeFlowFilter.filter(cs);
        printList(freeFlow, "流量10G");
        System.out.println("免费赠送生日提醒用户(星级为5星级以上):");
        List<Consumer> birthdayRemind = birthdayRemindFilter.filter(cs);
        printList(birthdayRemind, "生日提醒功能");

    }
    private static void printList(List<Consumer> cs, String bussiness) {
        for (Consumer c : cs) {
            System.out.println("[" + c.getStar() + "]星级用户[" + c.getName()
                    + "],在网年份[" + c.getExistsYears() + "],当前套餐为[" + c.getCombos()
                    + "],免费赠送[" + bussiness + "]");
        }
    }
}
