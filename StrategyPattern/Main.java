package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new Duck(new NoFly(), new NoQuack());
        System.out.println("Fly, rubber duck:");
        rubberDuck.fly();
        System.out.println("Then talk:");
        System.out.println(rubberDuck.quack());
        System.out.println();
        Duck cityDuck = new Duck(new SimpleFly(), new SimpleQuack());
        System.out.println("Fly, city duck:");
        cityDuck.fly();
        System.out.println("Talk, city duck:");
        System.out.println(cityDuck.quack());
    }
}
