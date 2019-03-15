package model.entity.hierarhy;

import model.entity.PlaneBase;

public class AirMilitary extends PlaneBase {

    private boolean weapon;

    public AirMilitary(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber, boolean weapon) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume, vendor, registrationNumber);
        this.weapon = true;
    }
}