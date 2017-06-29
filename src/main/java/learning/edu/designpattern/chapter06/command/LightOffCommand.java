package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.Light;

/**
 * Created by duchuunguyen on 6/28/17.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
