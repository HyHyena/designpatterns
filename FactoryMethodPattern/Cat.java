package FactoryMethodPattern;

public class Cat extends Animal{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
