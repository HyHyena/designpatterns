package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso("espresso");
        CaramelDecorator caramelDecorator = new CaramelDecorator(espresso);
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(caramelDecorator);
        System.out.println("What the heck have you ordered: " + chocolateDecorator.getDescription());
        System.out.println("Cost of this holy " + espresso.getDescription() + " will be: " + chocolateDecorator.cost());
    }
}
