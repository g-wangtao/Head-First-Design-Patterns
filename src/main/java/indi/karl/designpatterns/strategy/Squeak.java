package indi.karl.designpatterns.strategy;

/**
 * @ClassName: Squeak
 * @author: karl
 * @Description: TODO(功能描述) 
 * @date: 2018/1/25 22:48
 * @see indi.karl.designpatterns.strategy
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
