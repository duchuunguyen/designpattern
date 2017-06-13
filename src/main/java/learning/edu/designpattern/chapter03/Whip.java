package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        //System.out.println("Whip: 0.1");
        return 0.1f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
