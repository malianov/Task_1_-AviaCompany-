package model;

import model.entity.*;
import model.randoms.PlaneRegistrationCodesGenerator;
import model.randoms.PlanesGenerator;
import model.randoms.RandomGenerator;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public static List<AirPlane> airAssets = new ArrayList<>();

    public void AviaCompanyCreation() {
        String registrationCode;
        PlanesGenerator planesGenerator = new PlanesGenerator();

        View.AirplaneParkDescriptionPrinter(AirPlanesData.values().length);
        View.CompanyCreatedMessagePrinter(planesGenerator.getNumberOfPlanes());

        PlaneRegistrationCodesGenerator planeRegistrationCodes = new PlaneRegistrationCodesGenerator(planesGenerator.getNumberOfPlanes());

        String AirPark[] = new String[planesGenerator.getNumberOfPlanes()];

        for(int i = 0; i < planesGenerator.getNumberOfPlanes(); i++) {
            RandomGenerator rnd = new RandomGenerator(AirPlanesData.values().length);
            AirPark[i] = String.valueOf(AirPlanesData.values()[rnd.getRnd()-1]);

            registrationCode = "UR" + planeRegistrationCodes.getRegistrationNumber()[i];

            if(AirPark[i].startsWith("BOEING")) {
                airAssets.add(new Boeing(
                        AirPlanesData.valueOf(AirPark[i]).getModel(),
                        AirPlanesData.valueOf(AirPark[i]).getPassengersCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getCargoCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getMaxFlyDistance(),
                        AirPlanesData.valueOf(AirPark[i]).getFuelTankVolume(),
                        AirPlanesData.valueOf(AirPark[i]).getVendor(),
                        registrationCode));

            } else if (AirPark[i].startsWith("AIRBUS")) {
                airAssets.add(new Airbus(
                        AirPlanesData.valueOf(AirPark[i]).getModel(),
                        AirPlanesData.valueOf(AirPark[i]).getPassengersCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getCargoCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getMaxFlyDistance(),
                        AirPlanesData.valueOf(AirPark[i]).getFuelTankVolume(),
                        AirPlanesData.valueOf(AirPark[i]).getVendor(),
                        registrationCode));

            } else if (AirPark[i].startsWith("AN")) {
                airAssets.add(new Antonov(
                        AirPlanesData.valueOf(AirPark[i]).getModel(),
                        AirPlanesData.valueOf(AirPark[i]).getPassengersCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getCargoCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getMaxFlyDistance(),
                        AirPlanesData.valueOf(AirPark[i]).getFuelTankVolume(),
                        AirPlanesData.valueOf(AirPark[i]).getVendor(),
                        registrationCode));

            } else if (AirPark[i].startsWith("CESSNA")) {
                airAssets.add(new Cessna(
                        AirPlanesData.valueOf(AirPark[i]).getModel(),
                        AirPlanesData.valueOf(AirPark[i]).getPassengersCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getCargoCapacity(),
                        AirPlanesData.valueOf(AirPark[i]).getMaxFlyDistance(),
                        AirPlanesData.valueOf(AirPark[i]).getFuelTankVolume(),
                        AirPlanesData.valueOf(AirPark[i]).getVendor(),
                        registrationCode));
            } else {
                System.out.println("This is smth new in Enum :-)");
            }
        }
    }
}