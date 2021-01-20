package FacadePattern;

public class Class1 {
    public static Class1 invoke(){
        System.out.println("Invoking class 1");
        return new Class1();
    }
}
