package expand.designpattern.filter.filter_a;

/**
 * @author ronin
 * @version V1.0
 * @desc 用户
 * @since 2019/7/29 15:52
 */
public class Consumer {
    /**
     * 用户姓名
     */
    private String name;

    /**
     * 移动套餐
     */
    private Integer combos;

    /**
     * 用户注册时长
     */
    private Integer existsYears;

    /**
     * 用户星级
     */
    private Integer star;

    public Consumer(String name,Integer combos, Integer existsYears, Integer star) {
        this.name = name;
        this.combos = combos;
        this.existsYears = existsYears;
        this.star = star;
    }

    public Integer getCombos() {
        return combos;
    }

    public void setCombos(Integer combos) {
        this.combos = combos;
    }

    public Integer getExistsYears() {
        return existsYears;
    }

    public void setExistsYears(Integer existsYears) {
        this.existsYears = existsYears;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
