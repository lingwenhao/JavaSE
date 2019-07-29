package structure.decorator.decorator_e;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 18:39
 */
/**装饰者:持有抽象组件的引用*/
public abstract class Decotor extends Cipher{
    private Cipher cipher;

    public Decotor(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String cipherText) {
        return cipher.encrypt(cipherText);
    }
}
