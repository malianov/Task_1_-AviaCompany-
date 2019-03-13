package model.entity;

public enum AirPlanesData {

    AIRBUS_A220("Airbus", "Airbus_A220",110, 10000, 4000, 21918),
    AIRBUS_A300("Airbus", "Airbus_A300",266, 13000, 7500, 68150),
    AIRBUS_A310("Airbus", "Airbus_A310",220, 16000, 8050, 61070),
    AIRBUS_A318("Airbus", "Airbus_A318",132, 18000, 5700, 23859),
    AIRBUS_A319("Airbus", "Airbus_A319",156, 20000, 6850, 30190),
    AIRBUS_A320("Airbus", "Airbus_A320",180, 22000, 6150, 30190),
    AIRBUS_A321("Airbus", "Airbus_A321",220, 25000, 5950, 30030),

    AN2     ("An", "An-2",     12, 1500, 900,  900),
    AN3     ("An", "An-3",     12, 1800, 1200, 1270),
    AN24    ("An", "An-24",    48, 5300, 2000, 5100),
    AN26    ("An", "An-26",    43, 6500, 2550, 6300),
    AN158   ("An", "An-158",   99, 6000, 2500, 7200),

    BOEING_707("Boeing", "Boeing_707",179, 19300, 6820, 65700),
    BOEING_717("Boeing", "Boeing_717",124, 12000, 3820, 16670),
    BOEING_727("Boeing", "Boeing_727",189, 18300, 4400, 37020),
    BOEING_737("Boeing", "Boeing_737",130, 15700, 2090, 19500),
    BOEING_747("Boeing", "Boeing_747",490, 76800, 8500, 183380),
    BOEING_757("Boeing", "Boeing_757",224, 25970, 5550, 43490),

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

    AirPlanesData(String vendor, String model, int passengersCapacity, int cargoCapacity, int maxFlyDistance, int fuelTankVolume) {
        this.vendor             = vendor;
        this.model              = model;
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity      = cargoCapacity;
        this.maxFlyDistance     = maxFlyDistance;
        this.fuelTankVolume     = fuelTankVolume;
    }

}
