package StrategyPattern;

public class Duck {
    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;

    public Duck(IFlyBehavior iFlyBehavior, IQuackBehavior iQuackBehavior) {
        this.iFlyBehavior = iFlyBehavior;
        this.iQuackBehavior = iQuackBehavior;
    }

    public void fly(){
        iFlyBehavior.fly();
    }

    public String quack(){
        return iQuackBehavior.quack();
    }
}
