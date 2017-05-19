package learning.edu.designpattern.chapter01.behaviors;

/**
 * Created by duchuunguyen on 5/17/2017.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I don't know how to fly!!!");
    }
}
