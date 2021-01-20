package DecoratorPattern;

public class CaramelDecorator extends AddonDecorator{
    Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with caramel";
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
