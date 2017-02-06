/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dit952.lab.b.Car;
import dit952.lab.b.CarTransporter;
import dit952.lab.b.Volvo240;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTransporterTest {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /**Loads a car to the car transporter*/
    @Test    
    public void load(){
        CarTransporter ct=new CarTransporter(1,1);
        CarTransporter ct2=new CarTransporter(3,3);
        Car c=new Volvo240(1000,1000);
        ct.load(ct2);
        ct.load(c);
        assert(c.getXPos()!=ct.getXPos()&&c.getYPos()!=ct.getYPos()&&ct2.getXPos()!=ct.getXPos()&&ct2.getYPos()!=ct.getYPos());
        
        }
    @Test    
    public void unload(){
        CarTransporter ct=new CarTransporter(1,1);
        Car c1=new Volvo240(1,2);
        Car c2=new Volvo240(1,2);
        Car c3=new Volvo240(1,2);        
        Car c4=new Volvo240(1,2);        
        Car c5=new Volvo240(1,2);
        ct.load(c1);
        ct.load(c2);
        ct.load(c3);        
        ct.load(c4); 
        ct.unload();
        ct.load(c5);
        ct.startEngine();
        ct.gas(1);
        ct.move();
        System.out.println(c4.getXPos());
        assert(c4.getXPos()!=c3.getXPos()&&c4.getYPos()!=c3.getYPos());
        
        }
    @Test
    public void decreaseAngle(){
         CarTransporter ct=new CarTransporter(1,1);
         Car c=new Volvo240(3,3);
         ct.stopEngine();
         ct.increaseAngle();
         ct.decreaseAngle();
         ct.load(c);
         assert(c.getXPos()==ct.getXPos()&&c.getYPos()==ct.getYPos());
    }
}
