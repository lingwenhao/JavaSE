package action.iterator.iterator_f;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集团工资
 * @author ronin
 * @version V1.0
 * @since 2019/8/20 11:01
 */
public class PayManager extends Aggregate {
    private List<PayModel> list = new ArrayList<PayModel>();

    public List<PayModel> getPayList(){
        return list;
    }

    /**
     * 计算工资，并把工资信息填充到工资列表里面
     * 为了测试，做点数据进去
     */
    public void calcPay(){
        PayModel pm1 = new PayModel();
        pm1.setPay(3800);
        pm1.setUserName("张三");

        PayModel pm2 = new PayModel();
        pm2.setPay(5800);
        pm2.setUserName("李四");

        list.add(pm1);
        list.add(pm2);
    }

    @Override
    public Iterator createIterator() {
        return list.iterator();
    }

}
