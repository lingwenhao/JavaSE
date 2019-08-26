package structure.composite.composite_g;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，可以包含其它组合对象或者叶子对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 10:39
 */
public class Composite extends Component{

    @Override
    public void addChild(Component child) {
        //延迟初始化
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);

        //添加对父组件的引用
        child.setParent(this);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            //查找到要删除的组件在集合中的索引位置
            int idx = childComponents.indexOf(child);
            if (idx != -1) {
                //先把被删除的商品类别对象的父商品类别，
                //设置成为被删除的商品类别的子类别的父商品类别
                for(Component c : child.getChildren()){
                    //删除的组件对象是本实例的一个子组件对象
                    c.setParent(this);
                    //把被删除的商品类别对象的子组件对象添加到当前实例中
                    childComponents.add(c);
                }
                //真的删除
                childComponents.remove(idx);
            }
        }
    }

    @Override
    public List<Component> getChildren() {
        return childComponents;
    }

    private List<Component> childComponents = null;

    private String name = "";

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String preStr){
        System.out.println(preStr+"+"+this.name);
        if(this.childComponents!=null){
            preStr+=" ";
            for(Component c : childComponents){
                c.printStruct(preStr);
            }
        }
    }
}
