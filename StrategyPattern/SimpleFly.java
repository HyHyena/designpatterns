package StrategyPattern;

public class SimpleFly implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying simply");
    }
}
