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
    public Scania(){
        nrDoors = 2;
        color = Color.black;
        enginePower = 125;
	    turboOn = false;
        modelName="Scania";
    }
    @Override
    public double speedFactor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**Decreases the angle as long as the current angle os within the range [1,70]*/
    public void decreaseAngle(){
        if(platform.getAngle()==0)
        {
            
        }
        else
        {
         platform.decreaseAngle();   
        }     
    }
    
    /**Decreases the angle as long as the current angle os within the range [0,69]*/
        public void increaseAngle(){
        if(platform.getAngle()==70)
        {
            
        }
        else
        {
         platform.increaseAngle();   
        }     
    }
    
    
    
}
