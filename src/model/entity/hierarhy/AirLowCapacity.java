package model.entity.hierarhy;

import model.entity.PlaneBase;

public class AirLowCapacity extends PlaneBase {

    private boolean lowCapacity;

    public AirLowCapacity(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber, boolean lowCapacity) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume, vendor, registrationNumber);
        this.lowCapacity = true;
    }
}