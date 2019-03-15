package model.entity.database;

public enum AirPlanesDataElite {

    FALCON_900EX("Falcon", "Falcon 900EX",20, 1000, 8334, 10836),
    Bombardier_Global_Express("Bombardier", "Global_Express",20, 850, 9360, 17804);

    private String vendor;
    private String model;
    private int passengersCapacity;
    private int cargoCapacity;
    private int maxFlyDistance;
    private int fuelTankVolume;

    public String getVendor() {
        return vendor;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getMaxFlyDistance() {
        return maxFlyDistance;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    AirPlanesDataElite(String vendor, String model, int passengersCapacity, int cargoCapacity, int maxFlyDistance, int fuelTankVolume) {
        this.vendor             = vendor;
        this.model              = model;
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity      = cargoCapacity;
        this.maxFlyDistance     = maxFlyDistance;
        this.fuelTankVolume     = fuelTankVolume;
    }

}
