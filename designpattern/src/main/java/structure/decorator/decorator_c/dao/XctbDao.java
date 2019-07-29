package structure.decorator.decorator_c.dao;

import structure.decorator.decorator_c.domain.Xctb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 14:12
 */
public class XctbDao {
    public List<Xctb> list() throws Exception{
        ArrayList<Xctb> xctbList = new ArrayList<>();
        xctbList.add(new Xctb.Builder().id("0001").wzbt("标题1").wznr("内容1").build());
        xctbList.add(new Xctb.Builder().id("0002").wzbt("标题2").wznr("内容2").build());
        xctbList.add(new Xctb.Builder().id("0003").wzbt("标题3").wznr("内容3").build());
        return xctbList;
    }
}
