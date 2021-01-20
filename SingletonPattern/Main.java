package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Getting the Singleton for the first time");
        Singleton singleton = Singleton.getSingleton();
        System.out.println("Getting the Singleton for the second time");
        Singleton singleton1 = Singleton.getSingleton();
    }

}
