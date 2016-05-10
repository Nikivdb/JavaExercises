package be.cegeka.polymorfism.zoo;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void printKind() {
        super.printKind();
        System.out.println("I am also a duck!");
    }

    @Override
    public void saySomething() {
        System.out.println("Kwak kwak");
    }
}
