package be.cegeka.generics;

public class Garage {

    /**
     * Use the builder class from VehicleWithEngine as inspiration to
     * create a builder for all other classes (Car, Bike and vehicle)
     * and try to duplicate as little code as possible.
     *
     * When you are ready, you can comment out the code below. It should work as is,
     * so the order of the methods should not be changed. For example with the
     * creation of the bike: the .withSideWheels(false) method has to be called AFTER
     * the .withNumberOfPassengers(2) method.
     */

    public static void main(String[] args) {
//        Bike bike = Bike.aBike()
//                .withName("Bike")
//                .withNumberOfPassengers(2)
//                .withSideWheels(false)
//                .build();

        VehicleWithEngine vespa = VehicleWithEngine
                .aVehicleWithEngine()
                .withNumberOfPassengers(1)
                .withName("Vespa")
                .withEngineType(EngineType.ELECTRIC)
                .build();

//        Car car = Car
//                .aCar()
//                .withNumberOfPassengers(4)
//                .withName("Car")
//                .withEngineType(EngineType.DIESEL)
//                .withNumberOfDoors(4)
//                .build();

//        System.out.println(bike.toString());
        System.out.println(vespa.toString());
//        System.out.println(car.toString());
    }

}
