package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.GarageDoor;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
