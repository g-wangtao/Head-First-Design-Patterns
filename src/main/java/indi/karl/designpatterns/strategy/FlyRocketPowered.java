package indi.karl.designpatterns.strategy;

/**
 * @ClassName: FlyRocketPowered
 * @author: karl
 * @Description: TODO(火箭飞行行为类)
 * @date: 2018/1/24 17:52
 * @see indi.karl.designpatterns.strategy
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }

}
