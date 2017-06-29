package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.Stereo;

/**
 * Created by duchuunguyen on 6/28/17.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
