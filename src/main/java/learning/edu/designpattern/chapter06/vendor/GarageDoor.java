package learning.edu.designpattern.chapter06.vendor;

/**
 * Created by duchuunguyen up 6/28/17.
 */
public class GarageDoor {
    private String name;
    public GarageDoor(String name) {
        this.name = name;
    }
    public void up() {
        System.out.println(name + "garage door is UP");
    }

    public void down() {
        System.out.println(name + "garage door is DOWN");
    }
}
