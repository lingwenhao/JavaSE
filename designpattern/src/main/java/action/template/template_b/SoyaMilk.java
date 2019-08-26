package action.template.template_b;

/**
 * 豆浆
 */
public abstract class SoyaMilk {
    /**模板方法,设置为final,不允许子类覆盖此方法*/
    public final void make(){
        //选料
        select();
        //添加配料
        addIngredients();
        //浸泡
        soak();
        //打豆浆
        beat();
    }

    /**选择原料*/
    private void select(){
        System.out.println("第一步:选择新鲜的黄豆......");
    }

    /**添加不同的配料*/
    abstract void addIngredients();

    /**浸泡*/
    private void soak(){
        System.out.println("第三步:黄豆和配料浸泡三小时......");
    }

    /**打豆浆*/
    private void beat(){
        System.out.println("第四步:黄豆和配料放入豆浆机中打碎......");
    }


}
