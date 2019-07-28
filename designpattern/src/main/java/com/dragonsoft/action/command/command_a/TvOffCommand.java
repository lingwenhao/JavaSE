package com.dragonsoft.action.command.command_a;

public class TvOffCommand implements Command{

    private TvReceiver tvReceiver;

    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
