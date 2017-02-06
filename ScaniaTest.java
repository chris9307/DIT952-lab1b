/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dit952.lab.b.Car;
import dit952.lab.b.Scania;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScaniaTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
       @Test
       public void decreaseAngle() {
           Scania s=new Scania(1,1);
           s.getPlatform().setMaxAngle();
           int original=s.getPlatform().getAngle();
           s.stopEngine();
           s.decreaseAngle();
           assert(original==s.getPlatform().getAngle()+1);
           
       }
       
       @Test
       public void increaseAngle() {
           Scania s=new Scania(1,1);
           s.getPlatform().setMaxAngle();
           s.increaseAngle();
           assert(70==s.getPlatform().getAngle());
       }
}

