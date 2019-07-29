package structure.decorator.decorator_e;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 18:38
 */

/**具体的组件*/
public class ConcreteCipher extends Cipher{

    @Override
    public String encrypt(String cipherText) {
        return "我是加密后的暗号";
    }
}
