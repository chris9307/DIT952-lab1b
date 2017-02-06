/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

import java.util.LinkedList;

public class CarLoad {
    private LinkedList<Car>cars=new LinkedList<>();
    private int capacity=4;
    /**Loads a car to the car carrier if it is 5 points near the transporter*/
    public void load(Car c,int x,int y){
        if(c.getSize()>capacity){
            System.out.println("Exceeded maximum capacity");
        }        
        else if(!(Math.abs(c.getXPos() - x) < 5 && Math.abs(c.getYPos() - y) < 5)){
            System.out.println("The car is too far away");
        }
        else{
          c.setXPos(x);
          c.setYPos(y);
          cars.add(c);
          capacity-=c.getSize();
        }
             
    }
    
    /**Unloads cars FIFO and updates the position of each car in the X-axis*/
    public void unloadFirst(){     
            Car c=cars.pollFirst();
            c.setXPos(c.getXPos()-1);                            
    }
    /**Unloads cars FILO and updates the position of each car in the X-axis*/
    public void unloadLast(){              
            Car c=cars.pollLast();        
            c.setXPos(c.getXPos()-1);                          
    }
    /**Update the coordinates of every car stored in the transport*/
    public void updateCoordinates(int x, int y){
        for(int i=0;i<cars.size();i++){
            System.out.println("x: "+x+"  y:"+y);
            cars.get(i).setXPos(x);
            cars.get(i).setYPos(y);
        }
        
    }
    
    
}
