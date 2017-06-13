package learning.edu.designpattern.chapter04.pizza.newyork;

import learning.edu.designpattern.chapter04.pizza.Pizza;

/**
 * Created by duchuunguyen on 5/22/17.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
