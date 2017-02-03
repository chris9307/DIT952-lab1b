/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

import java.util.LinkedList;

public class CarLoad {
    LinkedList<Car>cars=new LinkedList<>();
    int capacity=4;
    /**Loads a car to the car carrier*/
    public void load(Car c){
        cars.add(c);        
    }
    
    /**Unloads cars*/
    public void unload(){
        cars.pollFirst();
    }
    /***/
    public void updatePos(){
        
    }
    /**Update the coordinates of every car*/
    public void updateCoordinates(int x, int y){
        for(int i=0;i<cars.size();i++){
            cars.get(i).setXPos(x);
            cars.get(i).setYPos(y);
        }
        
    }
    
}
