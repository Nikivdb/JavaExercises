package be.cegeka.polymorfism.zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.name = "Felix";
    }

    @Override
    public void printKind() {
        System.out.println("I am a Cat!");
    }

    @Override
    public void saySomething() {
        System.out.println("Meow");
    }
}
