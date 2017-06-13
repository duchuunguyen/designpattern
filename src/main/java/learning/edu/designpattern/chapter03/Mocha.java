package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public double cost() {
        //System.out.println("Mocha: 0.2");
        return 0.2 + getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
