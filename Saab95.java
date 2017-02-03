package dit952.lab.b;
//package dit952.lab1;
import java.awt.*;

public class Saab95 extends Car{
     
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }
    
   
/**Sets the turbo on, making the car move faster when the gas method is being called*/
    public void setTurboOn(){
	    turboOn = true;
    }

/**Sets the turbo off, making the car move slower when the gas method is being called*/
    public void setTurboOff(){
	    turboOn = false;
    }
/** returns the resulting speedfactor
 */    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
/**Makes the car go faster by increasing the current speed 
 */
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }
/**Makes the car go slower by decreasing the current speed */
    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    


 

}
