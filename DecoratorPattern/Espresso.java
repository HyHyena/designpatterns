package DecoratorPattern;

public class Espresso extends Beverage{
    String name;

    public Espresso(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.name;
    }

    @Override
    public int cost() {
        return 1;
    }
}
