package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
