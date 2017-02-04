/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

import java.awt.Color;


public class CarTransporter extends Car{
Platform platform=new Platform();
CarLoad  load=new CarLoad();

public CarTransporter(int x, int y){        
        super(x,y);
        size=100;
        nrDoors = 2;
        color = Color.black;
        enginePower = 125;
	    turboOn = false;
        modelName="Scania";
    }

   
        
    /**Loads a car to the car transporter*/
        public void load(Car c){
        
            if(platform.getAngle()==0){
                c.setXPos(this.x);
                c.setYPos(this.y);
                load.load(c);        
            }
            else{
                System.out.println("The platform must be down before loading");
            }

        }

    /**Unloads a car to the car transporter*/
    public void unload(){
        load.unloadFirst();
    }
    
    /**Decreases the angle to 0 if the car is not moving(currentSpeed=0)*/
    public void decreaseAngle(){
        if(currentSpeed==0)
        {            
            platform.setMinAngle();  
        }
        else
        { 
            System.out.println("Can not lower the ramp when the car transporter is moving");
        }     
    }
    /**Moves the car transporter and updates the coordinates of the cars inside*/
    public void move(){
        super.move();
        load.updateCoordinates(this.x,this.y);
    }
     /**Increases the angle as long as the current angle os within the range [0,69] and current speed is equal to 0*/
        public void increaseAngle(){            
            platform.setMaxAngle();                    
        }

    @Override
    public double speedFactor() {
        return enginePower;
    }

}
