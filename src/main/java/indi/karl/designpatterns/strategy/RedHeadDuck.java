package indi.karl.designpatterns.strategy;

/**
 * @ClassName: RedHeadDuck
 * @author: karl
 * @Description: TODO(红头鸭类)
 * @date: 2018/1/23 22:39
 * @see indi.karl.designpatterns.strategy
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I 'm a real Red Head duck");
    }
}
