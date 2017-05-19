package learning.edu.designpattern.chapter01;

/**
 * Created by duchuunguyen on 5/17/2017.
 */
public class DuckCall {
    private Duck duck;
    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.performQuack();
    }
}
