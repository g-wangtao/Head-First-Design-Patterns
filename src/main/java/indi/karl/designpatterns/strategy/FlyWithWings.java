package indi.karl.designpatterns.strategy;

/**
 * @ClassName: FlyWithWings
 * @author: karl
 * @Description: TODO(翅膀类行为类)
 * @date: 2018/1/23 22:45
 * @see indi.karl.designpatterns.strategy
 */
public class FlyWithWings implements FlyBehavior{

    /**
     * @Title:
     * @Description: TODO(翅膀飞行行为函数)
     * @param
     * @return
     * @throws
     */
    @Override
    public void fly() {
        System.out.println("I 'm flying!!");
    }
}
