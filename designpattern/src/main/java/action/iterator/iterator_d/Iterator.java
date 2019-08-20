package action.iterator.iterator_d;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/20 9:12
 */
public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
