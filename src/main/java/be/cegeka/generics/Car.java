package be.cegeka.generics;

public class Car extends VehicleWithEngine {

    private int numberOfDoors;

    private Car(String name, int numberOfPassengers, EngineType engineType, int numberOfDoors) {
        super(name, numberOfPassengers, engineType);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\tnumber of doors: " + numberOfDoors)
                .append("\n")
                .toString();
    }

}
