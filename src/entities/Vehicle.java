package entities; 

public class Vehicle extends Thread{

    private String type; 
    private String generalType; 
    private String licensePlate; 

    private Bridge bridge; 

    public Vehicle() {
    }

    public Vehicle(String type, String licensePlate, Bridge bridge) {
        this.type = type; 
        this.generalType = verifyType(type); 
        this.licensePlate = licensePlate; 
        this.bridge = bridge; 
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGeneralType() {
        return generalType;
    }

    public void setGeneralType(String generalType) {
        this.generalType = generalType;
    }

    public String getLicensePlate() {
        return licensePlate; 
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate; 
    }

    public Bridge getBridge(){ 
        return bridge;
    }

    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }

    private String verifyType(String type) {
        if (type.toLowerCase().equals("ambulance")) {
            this.setPriority(10);
            return type; 
        } 
        else if (type.toLowerCase().equals("police car")) {
            this.setPriority(9);
            return type; 
        }
        else {
            this.setPriority(5);
            return "comun"; 
        }
    }

    @Override
    public void run() {    
        System.out.println("-> Deposited item => " + type.toUpperCase() + " - " + licensePlate + " - Priority: " + this.getPriority());
        bridge.toEnter(generalType, licensePlate);
    
    }
}