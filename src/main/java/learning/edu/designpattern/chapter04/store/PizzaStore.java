package learning.edu.designpattern.chapter04.store;

import learning.edu.designpattern.chapter04.pizza.Pizza;
import learning.edu.designpattern.chapter04.pizza.PizzaType;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza(PizzaType.CHEESE);
    }
}
