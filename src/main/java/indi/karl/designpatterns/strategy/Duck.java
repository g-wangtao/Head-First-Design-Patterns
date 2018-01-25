package indi.karl.designpatterns.strategy;

/**
 * @ClassName: Duck
 * @author: karl
 * @Description: TODO(鸭子抽象类)
 * @date: 2018/1/21 17:19
 * @see indi.karl.designpatterns.strategy
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /**
     * @Title: display
     * @Description: TODO(鸭子展示函数)
     * @param
     * @return
     * @throws
     */
    abstract void display();

    /**
     * @Title: preformFly
     * @Description: TODO(鸭子飞函数)
     * @param
     * @return void
     * @throws
     */
    public void preformFly() {
        this.flyBehavior.fly();
    }

    /**
     * @Title: preformQuack
     * @Description: TODO(鸭子叫函数)
     * @param
     * @return void
     * @throws
     */
    public void preformQuack() {
        this.quackBehavior.quack();
    }

    /**
     * @Title: swim
     * @Description: TODO(游泳函数)
     * @param
     * @return
     * @throws
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * @Title: setFlyBehavior
     * @Description: TODO(设置鸭子飞行行为函数)
     * @param flyBehavior
     * @return void
     * @throws
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {

        this.flyBehavior = flyBehavior;
    }

    /**
     * @Title: setQuackBehavior
     * @Description: TODO(设置鸭子叫行为函数)
     * @param quackBehavior
     * @return void
     * @throws
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
