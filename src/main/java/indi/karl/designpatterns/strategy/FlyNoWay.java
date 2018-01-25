package indi.karl.designpatterns.strategy;

/**
 * @ClassName: FlyNoWay
 * @author: karl
 * @Description: TODO(功能描述) 
 * @date: 2018/1/24 11:25
 * @see indi.karl.designpatterns.strategy
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can 't fly");
    }

}
