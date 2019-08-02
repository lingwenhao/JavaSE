package expand.designpattern.nullobject.nullobject_b;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 15:26
 */
public class NullBook extends AbstractBook {

    /**
     * 由方法的提供者定制提示信息
     */
    @Override
    public void show() {
        System.out.println("Sorry，未找到符合您输入的ID的图书信息，请确认您输入的不是非法值......");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
