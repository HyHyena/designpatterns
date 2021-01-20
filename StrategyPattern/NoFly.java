package StrategyPattern;

public class NoFly implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm nat flying");
    }
}
