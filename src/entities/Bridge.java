package entities;

public class Bridge extends Thread{
    String bridge; 
    Boolean status;

    public Bridge(){
        status = false; 
    }

    public synchronized void toEnter(String type, String licensePlate) {
        try {
            while(status) {
                System.out.println("BRIDGE OCCUPIED!"); 
                wait();
            }

            System.out.println("\n The " + type.toUpperCase() + " - " + licensePlate + " was passing!"); 
        
            for(int i = 0; i < 5; i++) {
                System.out.print(" ~ "); 
                Thread.sleep(1000);
            }

            exit(); 

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void exit() {
        status = false; 
        notifyAll();        
    }
}
