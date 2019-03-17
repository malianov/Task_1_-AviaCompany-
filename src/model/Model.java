package model;

import model.entity.PlaneBase;
import model.entity.database.AirPlanesDataCitizen;
import model.entity.database.AirPlanesDataElite;
import model.entity.database.AirPlanesDataLowCapacity;
import model.entity.database.AirPlanesDataMilitary;
import model.entity.hierarhy.AirCitizen;
import model.randoms.PlanesNumberGenerator;
import model.randoms.PlanesRegistrationCodesGenerator;
import model.randoms.RandomGenerator;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public static List<PlaneBase> airAssets = new ArrayList<>();

    public void AviaCompanyCreation() {
        PlanesNumberGenerator planesNumberGenerator = new PlanesNumberGenerator();

        PlanesRegistrationCodesGenerator planesRegistrationCodes = new PlanesRegistrationCodesGenerator(planesNumberGenerator.getNumberOfPlanes());
        String AirPark[] = new String[planesNumberGenerator.getNumberOfPlanes()];

        View.airplaneParkDescriptionPrinter(AirPlanesDataCitizen.values().length
            + AirPlanesDataElite.values().length
            + AirPlanesDataLowCapacity.values().length
            + AirPlanesDataMilitary.values().length);

        View.companyCreatedMessagePrinter(planesNumberGenerator.getNumberOfPlanes());

        for(int i = 0; i < planesNumberGenerator.getNumberOfPlanes(); i++) {
            RandomGenerator rnd = new RandomGenerator(AirPlanesDataCitizen.values().length);
            AirPark[i] = String.valueOf(AirPlanesDataCitizen.values()[rnd.getRnd()-1]);

            airAssets.add(new AirCitizen(
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getModel(),
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getPassengersCapacity(),
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getCargoCapacity(),
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getMaxFlyDistance(),
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getFuelTankVolume(),
                        AirPlanesDataCitizen.valueOf(AirPark[i]).getVendor(),
                        "UR" + planesRegistrationCodes.getRegistrationNumber()[i]));


        }
    }
}





