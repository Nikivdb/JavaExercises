package be.cegeka.principles.dependencyInversion.withDI;

public class Lamp extends ButtonClient {

    @Override
    public void turnOn() {
        System.out.println("Lamp has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp has been turned off");
    }
}
