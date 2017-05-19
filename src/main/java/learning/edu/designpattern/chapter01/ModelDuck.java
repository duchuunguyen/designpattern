package learning.edu.designpattern.chapter01;

import learning.edu.designpattern.chapter01.behaviors.FlyNoWay;
import learning.edu.designpattern.chapter01.behaviors.Quack;

/**
 * Created by duchuunguyen on 5/17/2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }
    public void display() {
        System.out.println("Look like a model duck");
    }
}
