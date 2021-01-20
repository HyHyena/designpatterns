package AbstractFactoryPattern;

public class ConcreteFactoryA extends Factory {
    String name = "ConcreteFactoryA";

    @Override
    ProductA createProductA() {
        System.out.print(name + " produced ");
        ProductA productA = new ConcreteProductA1("ConcreteProductA1");
        System.out.println(productA.getName());
        return productA;
    }

    @Override
    ProductB createProductB() {
        System.out.print(name + " produced ");
        ProductB productB = new ConcreteProductB2("ConcreteProductB2");
        System.out.println(productB.getName());
        return productB;
    }
}
