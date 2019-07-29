package structure.decorator.decorator_e;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 18:43
 */
public class Client {
    public static void main(String[] args) {
        //普通加密
        Cipher concreteCipher = new ConcreteCipher();
        System.out.println(concreteCipher.encrypt("xxx"));

        //更复杂的加密
        concreteCipher = new ComplexCipherDecotor(concreteCipher);
        System.out.println(concreteCipher.encrypt("xxx"));
    }
}
