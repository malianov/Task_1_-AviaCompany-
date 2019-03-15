package model.entity.database;

public enum AirPlanesDataLowCapacity {

    AN2     ("An", "An-2",     12, 1500, 900,  900),
    AN3     ("An", "An-3",     12, 1800, 1200, 1270),

    CESSNA_CARAVAN  ("Cessna", "Cessna_Caravan", 13, 2041,    1680, 2249),
    CESSNA_402      ("Cessna", "Cessna_402",     9,  1260,    2360, 2000),
    CESSNA_421      ("Cessna", "Cessna_421",     8,  500,     2700, 100);

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

    AirPlanesDataLowCapacity(String vendor, String model, int passengersCapacity, int cargoCapacity, int maxFlyDistance, int fuelTankVolume) {
        this.vendor             = vendor;
        this.model              = model;
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity      = cargoCapacity;
        this.maxFlyDistance     = maxFlyDistance;
        this.fuelTankVolume     = fuelTankVolume;
    }

}
