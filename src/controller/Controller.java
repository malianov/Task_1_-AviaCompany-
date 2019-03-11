package controller;

import model.Model;
import view.View;

public class Controller {
    View view;
    Model model;
    Features controllerFeatures = new Features();

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void process() {
        // Создать авиакомпанию.
        model.AviaCompanyCreation();

        System.out.println("Посчитать общую вместимость и грузоподъемность.");
        controllerFeatures.SumOfPassengersPrinting(controllerFeatures.SumOfPassengersCalculation());
        controllerFeatures.SumOfCargoPrinting(controllerFeatures.SumOfCargoCalculation());

        System.out.println("Провести сортировку самолетов компании по дальности полета.");
        controllerFeatures.FlyDistanceSorting();

        System.out.println("Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.");
        controllerFeatures.FuelTankConsumption();

    }
}
