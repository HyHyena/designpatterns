package DecoratorPattern;

public class ChocolateDecorator extends AddonDecorator{
    Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with chocolate";
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
