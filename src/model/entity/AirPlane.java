package model.entity;

public abstract class AirPlane {

    private String registrationNumber;
    private String vendor;
    private String model;
    private int passengersCapacity;
    private int cargoCapacity;
    private double maxFlyDistance;
    private double fuelTankVolume;

    public AirPlane(String model, int passengersCapacity, int cargoCapacity, double maxFlyDistance, double fuelTankVolume) { //, String vendor, String registrationNumber)  {
        this.model = model;
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity = cargoCapacity;
        this.maxFlyDistance = maxFlyDistance;
        this.fuelTankVolume = fuelTankVolume;
    }

    public double fuelPerKilometerCalculation() {
        return getFuelTankVolume() / getMaxFlyDistance();
    }

    public String getModel() {
        return model;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public double getMaxFlyDistance() {
        return maxFlyDistance;
    }

    public double getFuelTankVolume() {
        return fuelTankVolume;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return getRegistrationNumber() + " " + getModel();
    }
}
