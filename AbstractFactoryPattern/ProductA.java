package AbstractFactoryPattern;

public abstract class ProductA {
    String name;

    public ProductA(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
