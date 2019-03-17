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
        view.sumOfPassengersPrinting(controllerFeatures.sumOfPassengersCalculation());
        view.sumOfCargoPrinting(controllerFeatures.sumOfCargoCalculation());
        controllerFeatures.flyDistanceSorting();
        controllerFeatures.fuelTankConsumption();
    }
}
