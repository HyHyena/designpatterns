package StrategyPattern;

public class NoQuack implements IQuackBehavior{
    @Override
    public String quack() {
        return "Nat quacking";
    }
}
