package TemplateMethodPattern;

public class ConcreteClass extends AbstractClass{
    @Override
    public void validate() {
        System.out.println("Validation from concretion");
    }
}
