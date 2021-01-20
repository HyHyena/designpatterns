package TemplateMethodPattern;

abstract public class AbstractClass {
    public void save(){
        System.out.println("saving from abstraction");
        this.validate();
        this.beforeSave();
        //save to BD
    }

    public abstract void validate();
    public void beforeSave(){
        System.out.println("before saving call from abstract");
    }
}
