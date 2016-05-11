package be.cegeka.generics;

public abstract class Vehicle {

    private String name;
    private int numberOfPassengers;

    protected Vehicle(String name, int numberOfPassengers) {
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Description for vehicle: " + name + "\n")
                .append("\tnumber of passengers: " + numberOfPassengers)
                .append("\n")
                .toString();
    }
}
