package be.cegeka.generics;

public class Bike extends Vehicle {

    private boolean hasSideWheels;

    private Bike(String name, int numberOfPassengers, boolean hasSideWheels) {
        super(name, numberOfPassengers);
        this.hasSideWheels = hasSideWheels;
    }

    public boolean hasSideWheels() {
        return hasSideWheels;
    }

    public void setHasSideWheels(boolean hasSideWheels) {
        this.hasSideWheels = hasSideWheels;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\thas side wheels: " + (hasSideWheels ? "yes" : "no"))
                .append("\n")
                .toString();
    }

}
