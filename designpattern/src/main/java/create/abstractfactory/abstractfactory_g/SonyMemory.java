package create.abstractfactory.abstractfactory_g;

/**
 * 索尼内存条
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 16:12
 */
public class SonyMemory implements MemoryApi{

    /**
     * 示意方法，内存具有缓存数据的能力
     */
    @Override
    public void cacheData() {
        System.out.println("正在使用索尼内存条.....");
    }
}
