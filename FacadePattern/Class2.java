package FacadePattern;

public class Class2 {
    public static Class2 invoke(){
        System.out.println("Invoking class 2");
        return new Class2();
    }
}
