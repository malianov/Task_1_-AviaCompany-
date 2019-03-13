package view;

public class View {

    private static final String AIRPLANE_PARK_DESCRIPTION = "Для компании доступен парк самолетов из ";
    private static final String SHTUK = " шт.";
    private static final String COMPANY_PARK_DESCRIPTION = "Компания создана, включает в себя ";
    private static final String PLANES = " самолетов.";

    private static final String COMMON_PEOPLE_CAPACITY = "Общая вместимость всех cамолетов компании: ";
    private static final String PEOPLES = " пассажиров ";
    private static final String STRING_RETURN = "\n";
    private static final String COMMON_CARGO_CAPACITY = "Общая грузоподьемность всех самолетов компании: ";
    private static final String KG = " кг. ";
    private static final String SORT_BASED_ON_DISTANCE_INCREASING = "Сортировка самолетов компании по возрастанию дальности:";
    private static final String FUEL_PER_KM_CONSUMPTION = "Выборка самолетов компании с потребляемым горючим в пределах от ";
    private static final String DO = " до ";
    private static final String LITRES_PER_KM = " литров на 1 км.";


    public static void AirplaneParkDescriptionPrinter(int sumOfPlanes) {
        System.out.println(AIRPLANE_PARK_DESCRIPTION + sumOfPlanes + SHTUK + STRING_RETURN);
    }
    public static void CompanyCreatedMessagePrinter(int sumOfCompanyPlanes) {
        System.out.println(COMPANY_PARK_DESCRIPTION + sumOfCompanyPlanes + PLANES + STRING_RETURN);
    }

    public static void CommonPeopleCapacityPrinter(int sumOfPassengers) {
        System.out.println(COMMON_PEOPLE_CAPACITY + sumOfPassengers + PEOPLES + STRING_RETURN);
    }

    public static void CommonCargoCapacityPrinter(int sumOfCargoCapacity) {
        System.out.println(COMMON_CARGO_CAPACITY + sumOfCargoCapacity + KG + STRING_RETURN);
    }

    public static void SortirIncreasingDistancePrinter() {
        System.out.println(SORT_BASED_ON_DISTANCE_INCREASING);
    }

    public static void FuelPerKmConsumption(double lowBoundary, double highBoundary) {
        System.out.println(STRING_RETURN + FUEL_PER_KM_CONSUMPTION + lowBoundary + DO + highBoundary + LITRES_PER_KM);
    }
}