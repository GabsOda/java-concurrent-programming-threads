package application;

import entities.Bridge;
import entities.Vehicle;
import services.Passing;

public class Program {
    
    public static void main(String[] args) {
        Bridge bridge = new Bridge(1); 

        Vehicle amb = new Vehicle("ambulance", "MOJ9801", bridge); 
        Vehicle pol = new Vehicle("police car", "MVC5841", bridge); 
        Vehicle car = new Vehicle("car", "HZV4074", bridge); 

        Passing pass = new Passing(bridge); 
    
        System.out.println(amb.getPriority());
        System.out.println(pol.getPriority());
        System.out.println(car.getPriority());

        amb.start();
        car.start();
        pol.start();
 
        pass.start();

    }
}
