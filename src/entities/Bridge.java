package entities;

import java.util.Objects;

public class Bridge extends Thread{
    String bridge[]; 
    Integer front, back, maxSize, atualSize; 

    public Bridge(int maxSize){
        bridge = new String[maxSize];
        this.maxSize = maxSize; 
        front = -1; 
        back = -1;
        this.atualSize = 0; 
    }

    public synchronized void toEnter(String item) {
        try {
            while(Objects.equals(atualSize, maxSize)) {
                wait();
            }

            back = (back + 1) % maxSize; 
            bridge[back] = item; 
            atualSize++; 

            if(front == -1) {
                front = back; 
            }   
        
            Thread.sleep(1000);
            notifyAll();

        }catch(InterruptedException e){
            
        }
    }

    public synchronized String exit() {
        try{
            String item = "";
            
            while(atualSize == 0){
                System.out.println("EMPTY BRIDGE!");
                wait();
            }

            item = bridge[front]; 
            bridge[front] = null; 
            front = (front + 1) % maxSize; 

            atualSize--; 

            Thread.sleep(1000); 
            notifyAll();

            return item; 

        }catch (InterruptedException e){
            return null; 
        }
    }
}
