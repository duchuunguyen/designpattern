package learning.edu.designpattern.chapter06.vendor;

import java.text.MessageFormat;

/**
 * Created by NguyDu01 on 6/29/2017.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String name;
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void off() {
        setSpeed(OFF);
    }

    public void high() {
        setSpeed(HIGH);
    }

    public void medium() {
        setSpeed(MEDIUM);
    }

    public void low() {
        setSpeed(LOW);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == OFF) {
            System.out.println(MessageFormat.format("{0} ceiling fan is OFF", name));
        } else {
            System.out.println(MessageFormat.format("Set {0} ceiling fan speed to {1}", name, speed));
        }
    }

    public int getSpeed() {
        return speed;
    }
}
