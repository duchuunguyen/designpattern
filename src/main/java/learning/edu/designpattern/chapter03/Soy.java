package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
