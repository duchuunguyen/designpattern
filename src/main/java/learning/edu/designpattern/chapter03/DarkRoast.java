package learning.edu.designpattern.chapter03;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        //System.out.println("Dark roast: 0.99");
        return 0.99f;
    }
}
