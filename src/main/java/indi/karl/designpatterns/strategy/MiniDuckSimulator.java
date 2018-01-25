package indi.karl.designpatterns.strategy;

/**
 * @ClassName: MiniDuckSimulator
 * @author: karl
 * @Description: TODO(模拟器)
 * @date: 2018/1/23 23:01
 * @see indi.karl.designpatterns.strategy
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        duck.display();
        duck.swim();
        duck.preformFly();
        duck.preformQuack();
        System.out.println("------------------------------------------");
        Duck duck1 = new RubberDuck();
        duck1.preformFly();
        duck1.preformQuack();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.preformFly();
        System.out.println("------------------------------------------");
        Duck duck3 = new ModelDuck();
        duck3.preformFly();
        duck3.preformQuack();
    }

}
