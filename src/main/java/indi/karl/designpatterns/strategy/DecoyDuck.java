package indi.karl.designpatterns.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I 'm a duck Decoy");
    }
}
