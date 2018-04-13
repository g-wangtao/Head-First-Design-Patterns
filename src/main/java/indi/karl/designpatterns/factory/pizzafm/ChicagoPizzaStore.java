package indi.karl.designpatterns.factory.pizzafm;

/**
 * Created by karl on 2018/4/2.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type))
            return new ChicagoStyleCheesePizza();
        else if ("veggie".equals(type))
            return new ChicagoStyleVeggiePizza();
        else if ("clam".equals(type))
            return new ChicagoStyleClamPizza();
        else if ("pepperoni".equals(type))
            return new ChicagoStylePepperoniPizza();
        else return null;
    }

}
