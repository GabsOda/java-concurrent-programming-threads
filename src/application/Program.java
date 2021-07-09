package application;

import entities.Bridge;
import entities.Vehicle;

public class Program {
    
    public static void main(String[] args) {
        Bridge bridge = new Bridge(); 

        Vehicle amb = new Vehicle("ambulance", "MOJ9801", bridge); 
        Vehicle amb2 = new Vehicle("ambulance", "NER6054", bridge); 
        Vehicle pol = new Vehicle("police car", "MVC5841", bridge); 
        Vehicle car = new Vehicle("car", "HZV4074", bridge); 
        Vehicle truck = new Vehicle("truck", "GTE4454", bridge); 
        Vehicle car2 = new Vehicle("car", "NER4966", bridge); 

        amb.start();
        car.start();
        truck.start();
        pol.start();
        amb2.start();
        car2.start();

    }
}
