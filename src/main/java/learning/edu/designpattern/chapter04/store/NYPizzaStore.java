package learning.edu.designpattern.chapter04.store;

import learning.edu.designpattern.chapter04.pizza.*;
import learning.edu.designpattern.chapter04.pizza.newyork.NYStyleCheesePizza;
import learning.edu.designpattern.chapter04.pizza.newyork.NYStyleClamPizza;
import learning.edu.designpattern.chapter04.pizza.newyork.NYStylePepperoniPizza;
import learning.edu.designpattern.chapter04.pizza.newyork.NYStyleVeggiePizza;

/**
 * Created by duchuunguyen on 5/23/17.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            default:
                return new NYStyleClamPizza();
        }
    }
}
