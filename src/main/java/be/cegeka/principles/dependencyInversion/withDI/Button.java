package be.cegeka.principles.dependencyInversion.withDI;

public abstract class Button {

    private ButtonClient buttonClient;

    public Button(ButtonClient buttonClient) {
        this.buttonClient = buttonClient;
    }

    public void detect() {
        boolean buttonOn = getPhysicalState();
        if (buttonOn) {
            buttonClient.turnOn();
        } else {
            buttonClient.turnOff();
        }
    }

    protected abstract boolean getPhysicalState();
}