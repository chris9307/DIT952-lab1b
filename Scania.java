package dit952.lab.b;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dit952.lab1;

/**
 *
 * @author Asus
 */
public class Scania extends Car{
    private Platform platform=new Platform();
    public Scania(int x, int y){
        super(x,y);
        nrDoors = 2;
        color = Color.black;
        enginePower = 125;
	    turboOn = false;
        modelName="Scania";
    }
    @Override
    public double speedFactor() {
        return enginePower*0.75;
    }

    /**Decreases the angle as long as the current angle is within the range [1,70] and current speed is equal to 0*/
    public void decreaseAngle(){
        if(platform.getAngle()>=1&&platform.getAngle()<=70&&currentSpeed==0)
        {
            System.out.println("Outside of valid range");
        }
        else
        {
            platform.decreaseAngle();   
        }     
    }
    
     /**Decreases the angle as long as the current angle os within the range [0,69] and current speed is equal to 0*/
        public void increaseAngle(){
            if(platform.getAngle()>=0&&platform.getAngle()<=69&&currentSpeed==0)
            {
                platform.increaseAngle();   
            }
            else
            {
                System.out.println("Outside of valid range");
            }     
    }
        
    
    public Platform getPlatform(){
        return platform;
    }
    
}
