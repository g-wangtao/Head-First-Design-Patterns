package indi.karl.designpatterns.factory.pizzafm;

/**
 * Created by karl on 2018/3/27.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
