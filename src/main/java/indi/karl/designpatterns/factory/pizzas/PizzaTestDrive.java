package indi.karl.designpatterns.factory.pizzas;

/**
 * Created by karl on 2018/2/24.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        System.out.println("====================begin====================");
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }

}
