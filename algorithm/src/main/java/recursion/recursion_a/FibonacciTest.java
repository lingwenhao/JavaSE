package recursion.recursion_a;


/**
 * 斐波那契数列:1 1 2 3 5 8 13
 * @author ronin
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));

    }
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return n;
        }else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
