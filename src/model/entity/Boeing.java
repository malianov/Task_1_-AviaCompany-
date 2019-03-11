package model.entity;

public class Boeing extends AirPlane {
    private String vendor;

    public Boeing(String model, int passengersCapacity, double cargoCapacity, double maxFlyDistance, double fuelTankVolume) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume);
    }
}