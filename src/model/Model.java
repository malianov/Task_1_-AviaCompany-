package model;

import model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public static List<AirPlane> airCompany = new ArrayList<>();

    public void AviaCompanyCreation() {
        //System.out.println("Start creating the company");
        airCompany.add(new AirPlane("Cessna A240", 150, 1500, 500, 306));
        airCompany.add(new AirPlane("Cessna A40", 10, 100, 450, 305));
        airCompany.add(new AirPlane("Cessna A24", 15, 150, 400, 40));
        airCompany.add(new AirPlane("Cessna A20", 50, 100, 40, 340));
        //System.out.println("Creating the company completed");


    }
}




