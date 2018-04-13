package indi.karl.designpatterns.factory.pizzafm;

/**
 * Created by karl on 2018/3/27.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type))
            return new NYStyleCheesePizza();
        else if ("clam".equals(type))
            return new NYStyleClamPizza();
        else if ("pepperoni".equals(type))
            return new NYStylePepperoniPizza();
        else if ("veggie".equals(type))
            return new NYStyleVeggiePizza();
        else
            return null;
    }
}

