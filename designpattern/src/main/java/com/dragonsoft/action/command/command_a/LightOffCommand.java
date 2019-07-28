package com.dragonsoft.action.command.command_a;

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
