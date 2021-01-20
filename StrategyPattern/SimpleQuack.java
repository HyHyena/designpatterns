package StrategyPattern;

public class SimpleQuack implements IQuackBehavior{
    @Override
    public String quack() {
        return "quack";
    }
}
