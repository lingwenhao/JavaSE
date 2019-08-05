package action.command.command_c;

public class LightOnCommand implements Command {

    private LightReceeiver lightReceeiver;

    public LightOnCommand(LightReceeiver lightReceeiver) {
        this.lightReceeiver = lightReceeiver;
    }

    @Override
    public void execute() {
        lightReceeiver.on();
    }

    @Override
    public void undo() {
        lightReceeiver.off();
    }
}
