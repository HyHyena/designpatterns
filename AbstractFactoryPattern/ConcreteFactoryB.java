package AbstractFactoryPattern;

public class ConcreteFactoryB extends Factory{
    String name = "ConcreteFactoryB";

    @Override
    ProductA createProductA() {
        System.out.print(name + " produced ");
        ProductA productA = new ConcreteProductA2("ConcreteProductA2");
        System.out.println(productA.getName());
        return productA;
    }

    @Override
    ProductB createProductB() {
        System.out.print(name + " produced ");
        ProductB productB = new ConcreteProductB1("ConcreteProductB1");
        System.out.println(productB.getName());
        return productB;
    }
}
