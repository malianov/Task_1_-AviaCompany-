package model.entity.hierarhy;

import model.entity.PlaneBase;

public class AirElite extends PlaneBase {

    private boolean bathroom;

    public AirElite(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber, boolean bathroom) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume, vendor, registrationNumber);
        this.bathroom = true;
    }
}