package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.GarageDoor;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor door) {
        this.garageDoor = door;
    }
    
    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}
