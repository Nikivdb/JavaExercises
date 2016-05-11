package be.cegeka.generics;

public class VehicleWithEngine extends Vehicle {

    private EngineType engineType;

    protected VehicleWithEngine(String name, int numberOfPassengers, EngineType engineType) {
        super(name, numberOfPassengers);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\tengine type: " + engineType.name())
                .append("\n")
                .toString();
    }

    public static Builder aVehicleWithEngine() { return new Builder(); }

    public static class Builder {

        private String name;
        private int numberOfPassengers;
        private EngineType engineType;

        public VehicleWithEngine build() {
            return new VehicleWithEngine(name, numberOfPassengers, engineType);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Builder withEngineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }
    }
}
