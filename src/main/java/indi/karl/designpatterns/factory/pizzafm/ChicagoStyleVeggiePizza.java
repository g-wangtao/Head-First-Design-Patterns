package indi.karl.designpatterns.factory.pizzafm;

/**
 * Created by wangtao on 2018/4/12.
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
