package FactoryMethodPattern;

import java.util.Random;

public class RandomAnimalFactory extends Factory{
    @Override
    Animal createAnimal(String name) {
        Random random = new Random();
        int num = random.nextInt(100);
        if (num > 0 && num < 50)
            return new Cat(name);
        else
            return new Dog(name);
    }
}
