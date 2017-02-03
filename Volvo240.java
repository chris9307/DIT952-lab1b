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

 
}
