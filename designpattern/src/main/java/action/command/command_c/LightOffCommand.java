package action.command.command_c;

public class LightOffCommand implements Command{

    private LightReceeiver lightReceeiver;

    public LightOffCommand(LightReceeiver lightReceeiver) {
        this.lightReceeiver = lightReceeiver;
    }

    @Override
    public void execute() {
        lightReceeiver.off();
    }

    @Override
    public void undo() {
        lightReceeiver.on();
    }
}
