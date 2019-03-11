package controller;

import model.Model;
import model.entity.AirPlane;

public class Features {

    public int SumOfPassengersCalculation() {
        int sumOfPassengers = Model.airCompany.stream()
                .mapToInt(AirPlane::getPassengersCapacity)
                .sum();

        return sumOfPassengers;
    }

    public double SumOfCargoCalculation() {
        double sumOfCargoCapacity = Model.airCompany.stream()
                .mapToDouble(AirPlane::getCargoCapacity)
                .sum();

        return sumOfCargoCapacity;
    }


    public void SumOfPassengersPrinting(int sumOfPassengers) {
        System.out.println("Общая вместимость всех доступных самолетов: " + sumOfPassengers + " человек");
    }

    public void SumOfCargoPrinting(double sumOfCargoCapacity) {
        System.out.println("Общая грузоподьемность всех доступных самолетов: " + sumOfCargoCapacity + " кг.");
    }

    public void FlyDistanceSorting() {
        Model.airCompany.stream()
                .sorted((p1, p2) -> ((Double) p1.getMaxFlyDistance()).compareTo((Double) p2.getMaxFlyDistance()))
                .forEach(System.out::println);
    }

    public void FuelTankConsumption() {
        double lowBoundary = 100.0;
        double highBoundary = 400.0;

        Model.airCompany.stream()
                .filter(x -> (x.getFuelTankVolume() > lowBoundary))
                .filter(x -> (x.getFuelTankVolume() < highBoundary))
                .forEach(System.out::println);
    }
}
