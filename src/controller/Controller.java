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
        model.AviaCompanyCreation();
        view.SumOfPassengersPrinting(controllerFeatures.SumOfPassengersCalculation());
        view.SumOfCargoPrinting(controllerFeatures.SumOfCargoCalculation());
        controllerFeatures.FlyDistanceSorting();
        controllerFeatures.FuelTankConsumption();
    }
}
