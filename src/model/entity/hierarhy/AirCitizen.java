package model.entity.hierarhy;

import model.entity.PlaneBase;

public class AirCitizen extends PlaneBase {

    public AirCitizen(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume, vendor, registrationNumber);
    }
}