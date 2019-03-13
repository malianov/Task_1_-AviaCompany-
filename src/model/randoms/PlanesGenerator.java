package model.randoms;

import model.entity.AirPlanesData;

public class PlanesGenerator {

    private int numberOfPlanes;
    private int maxNumberOfPlanes = AirPlanesData.values().length;

    public PlanesGenerator() {
        RandomGenerator rnd = new RandomGenerator(maxNumberOfPlanes);
        this.numberOfPlanes = rnd.getRnd();
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }
}