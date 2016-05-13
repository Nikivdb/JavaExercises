package be.cegeka.principles.dependencyInversion.withDI;

public class ButtonImp extends Button {

    public ButtonImp(ButtonClient buttonClient) {
        super(buttonClient);
    }

    @Override
    protected boolean getPhysicalState() {
        return Math.random() < 0.5;
    }
}
