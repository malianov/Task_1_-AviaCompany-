package model.entity;

public class Cessna extends AirPlane {
    private String vendor;

    public Cessna(String model, int passengersCapacity, double cargoCapacity, double maxFlyDistance, double fuelTankVolume) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume);
    }
}