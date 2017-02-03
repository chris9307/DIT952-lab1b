/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;


public class CarTransporter {
Platform platform=new Platform();
CarLoad carload=new CarLoad();
/**Loads a car to the car transporter*/
public void load(Car c){
    carload.load(c);
}

/**Unloads a car to the car transporter*/
public void unload(){
    carload.unload();
}

}
