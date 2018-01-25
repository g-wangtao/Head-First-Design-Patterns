package indi.karl.designpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I 'm a real Mallard duck");
    }
}
