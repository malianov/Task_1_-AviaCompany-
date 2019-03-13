package model.randoms;

import java.util.Random;

public class PlaneRegistrationCodesGenerator {

    int[] registrationNumber;

    public PlaneRegistrationCodesGenerator(int NumberOfPlanes) {
        registrationNumber = new Random()
                .ints(10000, 100000)
                .distinct()
                .limit(NumberOfPlanes)
                .toArray();
    }

    public int[] getRegistrationNumber() {
        return registrationNumber;
    }
}