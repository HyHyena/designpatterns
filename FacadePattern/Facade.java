package FacadePattern;

public class Facade {
    private Class1 class1;
    private Class2 class2;

    public Facade() {
    }

    public void invokeClass1(){
        class1 = Class1.invoke();
    }

    public void invokeClass2(){
        class2 = Class2.invoke();
    }
}
