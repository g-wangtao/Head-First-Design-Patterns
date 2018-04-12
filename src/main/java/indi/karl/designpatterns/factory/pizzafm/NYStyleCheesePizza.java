package indi.karl.designpatterns.factory.pizzafm;

/**
 * Created by karl on 2018/3/30.
 */
public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
