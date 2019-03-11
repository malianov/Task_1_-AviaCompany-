package model.entity;

public class Airbus extends AirPlane {
    private String  vendor;

    public Airbus(String model, int passengersCapacity, double cargoCapacity, double maxFlyDistance, double fuelTankVolume) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume);
    }
}