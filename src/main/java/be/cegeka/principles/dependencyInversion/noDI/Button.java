package be.cegeka.principles.dependencyInversion.noDI;

/*
* Dependency inversion tell us the following:
*   Depend on abstractions, not on concretions.
*       A. High level modules should not depend on low level modules. Both should depend on abstraction.
*       B. Abstractions should not depend upon details. Details should depend on abstractions.
* */

public class Button {

    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void detect() {
        boolean buttonOn = getPhysicalState();
        if (buttonOn) {
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }

    private boolean getPhysicalState() {
        return Math.random() < 0.5;
    }
}
