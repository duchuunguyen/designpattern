package learning.edu.designpattern.chapter01;

import learning.edu.designpattern.chapter01.behaviors.FlyRocketPowered;

/**
 * Created by duchuunguyen on 5/17/2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
    }
}
