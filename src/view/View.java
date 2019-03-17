package view;

import java.util.ResourceBundle;

public class View implements TextConstants {

    public static String BUNDLE_NAME = "resources_en";

    static ResourceBundle bundleDefault = ResourceBundle.getBundle(BUNDLE_NAME);

    public static void airplaneParkDescriptionPrinter(int sumOfPlanes) {
        System.out.println(bundleDefault.getString(AIRPLANE_PARK_DESCRIPTION) + SPACE + sumOfPlanes + SPACE + bundleDefault.getString(SHTUK) + STRING_RETURN);
    }

    public static void companyCreatedMessagePrinter(int sumOfCompanyPlanes) {
        System.out.println(bundleDefault.getString(COMPANY_PARK_DESCRIPTION) + SPACE + sumOfCompanyPlanes + SPACE + bundleDefault.getString(PLANES) + STRING_RETURN);
    }

    public void commonPeopleCapacityPrinter(int sumOfPassengers) {
        System.out.println(bundleDefault.getString(COMMON_PEOPLE_CAPACITY) + SPACE + sumOfPassengers + SPACE + bundleDefault.getString(PEOPLES) + STRING_RETURN);
    }

    public void commonCargoCapacityPrinter(int sumOfCargoCapacity) {
        System.out.println(bundleDefault.getString(COMMON_CARGO_CAPACITY) + SPACE + sumOfCargoCapacity + SPACE + bundleDefault.getString(KG) + STRING_RETURN);
    }

    public static void sortirIncreasingDistancePrinter() {
        System.out.println(bundleDefault.getString(SORT_BASED_ON_DISTANCE_INCREASING));
    }

    public static void fuelPerKmConsumption(double lowBoundary, double highBoundary) {
        System.out.println(STRING_RETURN + bundleDefault.getString(FUEL_PER_KM_CONSUMPTION) + SPACE + lowBoundary + SPACE + bundleDefault.getString(DO) + SPACE + highBoundary + SPACE + bundleDefault.getString(LITRES_PER_KM));
    }

    public void sumOfPassengersPrinting(int sumOfPassengers) {
        commonPeopleCapacityPrinter(sumOfPassengers);
    }

    public void sumOfCargoPrinting(int sumOfCargoCapacity) {
        commonCargoCapacityPrinter(sumOfCargoCapacity);
    }
}
