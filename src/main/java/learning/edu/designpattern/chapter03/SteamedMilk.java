package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed milk";
    }
}
