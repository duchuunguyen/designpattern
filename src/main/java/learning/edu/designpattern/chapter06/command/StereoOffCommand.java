package learning.edu.designpattern.chapter06.command;

import learning.edu.designpattern.chapter06.vendor.Stereo;

/**
 * Created by duchuunguyen on 6/28/17.
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
