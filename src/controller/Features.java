package controller;

import model.Model;
import model.entity.AirPlane;
import view.View;

public class Features {

    public int SumOfPassengersCalculation() {
        return Model.airAssets.stream()
                .mapToInt(AirPlane::getPassengersCapacity)
                .sum();
    }

    public int SumOfCargoCalculation() {
        return Model.airAssets.stream()
                .mapToInt(AirPlane::getCargoCapacity)
                .sum();
    }

    public void SumOfPassengersPrinting(int sumOfPassengers) {
        View.CommonPeopleCapacityPrinter(sumOfPassengers);
    }

    public void SumOfCargoPrinting(int sumOfCargoCapacity) {
        View.CommonCargoCapacityPrinter(sumOfCargoCapacity);
    }

    public void FlyDistanceSorting() {
        View.SortirIncreasingDistancePrinter();
        Model.airAssets.stream()
                .sorted((p1, p2) -> ((Double) p1.getMaxFlyDistance()).compareTo((Double) p2.getMaxFlyDistance()))
                .forEach(System.out::println);
    }

    public void FuelTankConsumption() {
        double lowBoundary  = 1;
        double highBoundary = 5;

        View.FuelPerKmConsumption(lowBoundary, highBoundary);
        Model.airAssets.stream()
                .filter(x -> (x.fuelPerKilometerCalculation() > lowBoundary))
                .filter(x -> (x.fuelPerKilometerCalculation() < highBoundary))
                .forEach(System.out::println);
    }
}