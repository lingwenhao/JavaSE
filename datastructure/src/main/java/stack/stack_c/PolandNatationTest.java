package stack.stack_c;

/**
 * 逆波兰表达式测试
 * @author ronin
 */
public class PolandNatationTest {
    public static void main(String[] args) {
        //(3+4)*5-6 => 3 4 + 5 * 6 -
        String epression = "3 4 + 5 * 6 -";
        int i = PolandNatation.calcResult(epression);
        System.out.println(i);
    }
}
