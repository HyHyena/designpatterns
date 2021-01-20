package AdapterPattern;

public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        System.out.println("Implementing target interface");
        adaptee.specialRequest();
    }
}
