package model.entity;

public class Airbus extends AirPlane {

    private String vendor = "Airbus";
    String registrationNumber;

    public Airbus(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume, String vendor, String registrationNumber) {
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