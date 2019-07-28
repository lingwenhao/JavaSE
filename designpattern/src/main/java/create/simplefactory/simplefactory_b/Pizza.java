package create.simplefactory.simplefactory_b;

/**
 * pizza的制作分为四个流程
 *      prepare()
 *      bake()
 *      cut()
 *      box()
 */
public abstract class Pizza {
    public abstract void prepare();
    public void bake(){
        System.out.println("bake....");
    }
    public void cut(){
        System.out.println("cut.....");
    }
    public void box(){
        System.out.println("box.....");
    }
}
