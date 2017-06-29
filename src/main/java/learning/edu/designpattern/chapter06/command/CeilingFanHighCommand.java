package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.CeilingFan;

/**
 * Created by NguyDu01 on 6/29/2017.
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
