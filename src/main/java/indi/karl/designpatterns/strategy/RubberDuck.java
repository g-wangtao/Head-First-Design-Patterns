package indi.karl.designpatterns.strategy;

/**
 * @ClassName: RubberDuck
 * @author: karl
 * @Description: TODO(橡皮鸭类)
 * @date: 2018/1/24 0:17
 * @see indi.karl.designpatterns.strategy
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I 'm a rubber duck ie");
    }
}
