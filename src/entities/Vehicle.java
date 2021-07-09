package entities; 

public class Vehicle extends Thread{

    private String type; 
    private String licensePlate; 

    private Bridge bridge; 

    public Vehicle() {
    }

    public Vehicle(String type, String licensePlate, Bridge bridge) {
        this.type = verifyType(type); 
        this.licensePlate = licensePlate; 
        this.bridge = bridge; 
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        while(true){
            bridge.toEnter(type);
            System.out.println("-> Deposited item: " + type + ": " + licensePlate);
        }
    }
}