package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.CeilingFan;

/**
 * Created by NguyDu01 on 6/29/2017.
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }
}
