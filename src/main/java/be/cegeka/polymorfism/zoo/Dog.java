package be.cegeka.polymorfism.zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void printKind() {
        System.out.println("I am a dog!");
    }

    @Override
    public void saySomething() {
        System.out.println("Woof!");
    }
}
