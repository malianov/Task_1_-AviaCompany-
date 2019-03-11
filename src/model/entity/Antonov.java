package model.entity;

public class Antonov extends AirPlane {
    private String vendor;

    public Antonov(String model, int passengersCapacity, double cargoCapacity, double maxFlyDistance, double fuelTankVolume) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume);
    }
}