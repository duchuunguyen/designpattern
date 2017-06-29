package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.Light;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
