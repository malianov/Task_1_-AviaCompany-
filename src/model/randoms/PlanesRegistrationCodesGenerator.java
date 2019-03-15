package model.randoms;

import java.util.Random;

public class PlanesRegistrationCodesGenerator {
    private final int REGISTRATION_CODE_MAX = 99999;   // UR-10000 ... UR-99999
    private final int REGISTRATION_CODE_MIN = 10000;

    int[] registrationNumber;

    public PlanesRegistrationCodesGenerator(int NumberOfPlanes) {
        registrationNumber = new Random()
                .ints(REGISTRATION_CODE_MIN, REGISTRATION_CODE_MAX)
                .distinct()
                .limit(NumberOfPlanes)
                .toArray();
    }

    public int[] getRegistrationNumber() {
        return registrationNumber;
    }
}
