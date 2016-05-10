package be.cegeka.polymorfism.zoo;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printKind() {
        System.out.println("I am an animal");
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public abstract void saySomething();


}
