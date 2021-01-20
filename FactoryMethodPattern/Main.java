package FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {
        int catCount = 0;
        int dogCount = 0;
        RandomAnimalFactory animalFactory = new RandomAnimalFactory();
        for (int i = 0; i < 100; i++){
            Animal animal = animalFactory.createAnimal("");
            if (animal instanceof Cat)
                catCount++;
            else if(animal instanceof Dog)
                dogCount++;
        }
        System.out.println("Cats produced: " + catCount);
        System.out.println("Dogs produced: " + dogCount);
    }

}
