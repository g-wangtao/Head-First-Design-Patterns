package indi.karl.designpatterns.strategy;

/**
 * @ClassName: Quack
 * @author: karl
 * @Description: TODO(嘎嘎叫行为类)
 * @date: 2018/1/23 22:54
 * @see indi.karl.designpatterns.strategy
 */
public class Quack implements QuackBehavior{
    /**
     * @Title: quack
     * @Description: TODO(鸭子嘎嘎叫行为函数)
     * @param
     * @return
     * @throws
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
