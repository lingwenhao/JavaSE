package action.iterator.iterator_f;

import java.util.Iterator;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/20 11:03
 */
public class Client {

    public static void main(String[] args) {
        //访问集团的工资列表
        PayManager payManager= new PayManager();
        //先计算再获取
        payManager.calcPay();
        System.out.println("集团工资列表:");
        test(payManager.createIterator());

        //迭代数组形式的元素
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("被收购的子公司工资列表:");
        test(salaryManager.createIterator());
    }

    /**
     * 测试通过访问聚合对象的迭代器，是否能正常访问聚合对象
     * @param it 聚合对象的迭代器
     */
    private static void test(Iterator it){
        while(it.hasNext()){
            PayModel pm = (PayModel)it.next();
            System.out.println(pm);
        }
    }

}
