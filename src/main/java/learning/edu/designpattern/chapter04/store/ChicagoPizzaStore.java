package learning.edu.designpattern.chapter04.store;

import learning.edu.designpattern.chapter04.pizza.Pizza;
import learning.edu.designpattern.chapter04.pizza.PizzaType;
import learning.edu.designpattern.chapter04.pizza.chicago.ChicagoStyleCheesePizza;
import learning.edu.designpattern.chapter04.pizza.chicago.ChicagoStyleClamPizza;
import learning.edu.designpattern.chapter04.pizza.chicago.ChicagoStylePepperoniPizza;
import learning.edu.designpattern.chapter04.pizza.chicago.ChicagoStyleVeggiePizza;

/**
 * Created by duchuunguyen on 5/26/17.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            default:
                return new ChicagoStyleClamPizza();
        }
    }
}
