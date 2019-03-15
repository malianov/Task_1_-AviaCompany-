package model.entity.database;

public enum AirPlanesDataMilitary {

    SU27     ("Suchoi", "CU-27",     2, 13000, 3680,  9600);

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

    AirPlanesDataMilitary(String vendor, String model, int passengersCapacity, int cargoCapacity, int maxFlyDistance, int fuelTankVolume) {
        this.vendor             = vendor;
        this.model              = model;
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity      = cargoCapacity;
        this.maxFlyDistance     = maxFlyDistance;
        this.fuelTankVolume     = fuelTankVolume;
    }

}
