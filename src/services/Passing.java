package services; 

import entities.Bridge;

public class Passing extends Thread{
    Bridge bridge; 

    public Passing(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void run() {
        String item; 
        while(true) {
            try{
                item = bridge.exit(); 
                System.out.println(" ~~ " + item + " is passing the bridge");
            }catch(Exception e) {
                
            }
        }
    }
}
