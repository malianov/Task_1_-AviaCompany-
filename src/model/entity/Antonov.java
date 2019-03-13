package model.entity;

public class Antonov extends AirPlane {

    String vendor = "Airbus";
    String registrationNumber;

    public Antonov(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber) {
        super(model, passengersCapacity, cargoCapacity, maxFlyDistance, fuelTankVolume);
        this.vendor = vendor;
        this.registrationNumber = registrationNumber;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
}