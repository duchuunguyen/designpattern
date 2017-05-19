package learning.edu.designpattern.chapter01;

import learning.edu.designpattern.chapter01.behaviors.FlyWithWings;
import learning.edu.designpattern.chapter01.behaviors.Quack;

/**
 * Created by duchuunguyen on 5/3/2017.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    public void display() {
        System.out.println("Look like a mallard duck");
    }
}
