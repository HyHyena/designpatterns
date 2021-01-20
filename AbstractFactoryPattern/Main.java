package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Factory factoryB = new ConcreteFactoryB();
        ProductA productAA = factoryA.createProductA();
        ProductB productBA = factoryA.createProductB();
        ProductA productAB = factoryB.createProductA();
        ProductB productBB = factoryB.createProductB();
    }

}
