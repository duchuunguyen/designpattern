package learning.edu.designpattern.chapter01.behaviors;

/**
 * Created by duchuunguyen on 5/17/2017.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
