/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

import java.awt.Color;


public class CarTransporter extends Car{
Platform platform=new Platform();
CarLoad carload=new CarLoad();

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
                carload.load(c);        
            }
            else{
                System.out.println("The platform must be down before loading");
            }

        }

    /**Unloads a car to the car transporter*/
    public void unload(){
        carload.unloadLast();
    }

    @Override
    public double speedFactor() {
        return enginePower;
    }

}
