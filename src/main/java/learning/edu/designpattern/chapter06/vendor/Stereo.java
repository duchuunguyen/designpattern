package learning.edu.designpattern.chapter06.vendor;

import java.text.MessageFormat;

/**
 * Created by duchuunguyen on 6/28/17.
 */
public class Stereo {
    private int volume;
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is ON");
    }

    public void off() {
        System.out.println(name + " stereo is OFF");
    }

    public void setCD() {
        System.out.println(MessageFormat.format("Set CD for {0} stereo", name));
    }

    public void setVolume(int volume) {
        System.out.println(MessageFormat.format("Set {0} stereo volume to {1}", name, volume));
    }
}
