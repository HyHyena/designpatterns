package SingletonPattern;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null){
            System.out.println("Creating singleton");
            singleton = new Singleton();
        }
        System.out.println("Returning singleton");
        return singleton;
    }
}
