package action.command.command_e;

/**
 * 食品类
 * @author ronin
 * @version V1.0
 * @since 2019/8/5 13:52
 */
public class Food {
    private String type;
    private String name;

    public Food(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
