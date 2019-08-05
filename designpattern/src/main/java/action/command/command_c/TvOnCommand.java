package action.command.command_c;

public class TvOnCommand implements Command{

    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
