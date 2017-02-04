/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

public class Ferry extends Vehicle {
CarLoad load=new CarLoad();
Platform platform=new Platform();
public Ferry(int x, int y){
    super(x,y);
}
    /**Loads a car to the Ferry*/
    public void load(Car c){
        load.load(c);
    }
    /**Unloads a car from the Ferry*/
    public void unload(){        
        load.unloadLast();        
    }
    
     /**Decreases the angle to 0 if the car is not moving(currentSpeed=0)*/
    public void decreaseAngle(){
        if(currentSpeed==0)
        {            
            platform.setMinAngle();  
        }
        else
        { 
            System.out.println("Can not lower the ramp when the ferry is moving");
        }     
    }
    
     /**Increases the angle as long as the current angle os within the range [0,69] and current speed is equal to 0*/
        public void increaseAngle(){            
            platform.setMaxAngle();                    
        }
    
    public void move(){
        super.move();
        load.updateCoordinates(this.x,this.y);
    }
    @Override
    public double speedFactor() {
        return enginePower*0.6;
    }
    
}
