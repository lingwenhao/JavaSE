package com.dragonsoft.action.command.command_a;

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
