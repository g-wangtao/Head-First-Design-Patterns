package indi.karl.designpatterns.strategy;

public class FakeQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Q wak");
    }
}
