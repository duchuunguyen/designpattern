package learning.edu.designpattern.chapter01;

import learning.edu.designpattern.chapter01.behaviors.FlyNoWay;
import learning.edu.designpattern.chapter01.behaviors.Squeak;

/**
 * Created by duchuunguyen on 5/3/2017.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super();
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    public void display() {
        System.out.println("Look like a rubber duck");
    }
}
