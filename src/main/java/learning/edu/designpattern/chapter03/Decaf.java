package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
