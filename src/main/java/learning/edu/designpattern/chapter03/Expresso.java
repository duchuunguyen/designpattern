package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
