package AbstractFactoryPattern;

public abstract class ProductB {
    String name;

    public ProductB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
