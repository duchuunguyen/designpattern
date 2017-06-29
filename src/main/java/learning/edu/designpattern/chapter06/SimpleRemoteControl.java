package learning.edu.designpattern.chapter06;

import learning.edu.designpattern.chapter06.command.Command;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
