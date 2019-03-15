package model.randoms;

import model.entity.database.AirPlanesDataCitizen;
import model.entity.database.AirPlanesDataElite;
import model.entity.database.AirPlanesDataLowCapacity;
import model.entity.database.AirPlanesDataMilitary;

public class PlanesNumberGenerator {

    private int numberOfPlanes;
    private int maxNumberOfPlanes = AirPlanesDataCitizen.values().length
            + AirPlanesDataElite.values().length
            + AirPlanesDataLowCapacity.values().length
            + AirPlanesDataMilitary.values().length;

    public PlanesNumberGenerator() {
        RandomGenerator rnd = new RandomGenerator(maxNumberOfPlanes);
        this.numberOfPlanes = rnd.getRnd();
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }
}