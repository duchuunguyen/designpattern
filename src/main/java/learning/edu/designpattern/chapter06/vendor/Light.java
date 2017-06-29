package learning.edu.designpattern.chapter06.vendor;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class Light {
    private String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(name + " light is ON");
    }

    public void off() {
        System.out.println(name + " light is OFF");
    }
}
