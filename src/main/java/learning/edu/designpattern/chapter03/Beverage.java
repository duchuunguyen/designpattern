package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
