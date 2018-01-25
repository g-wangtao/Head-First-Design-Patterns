package indi.karl.designpatterns.strategy;

/**
 * @ClassName: ModelDuck
 * @author: karl
 * @Description: TODO(功能描述)
 * @date: 2018/1/24 13:37
 * @see indi.karl.designpatterns.strategy
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I 'm a model duck");
    }

}
