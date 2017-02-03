package dit952.lab.b;
//package dit952.lab1;
import java.awt.*;

public class Volvo240 extends Car{
 public final static double trimFactor = 1.25;
      
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

/** returns the resulting speedfactor
 */  
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    /**Makes the car go faster by increasing the current speed 
     */
    public void incrementSpeed(double amount){
	 currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }
    /**Makes the car go slower by decreasing the current speed 
    */

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
}
