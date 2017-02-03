/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

public class Ferry extends Vehicle {
CarLoad load=new CarLoad();
    /**Loads a car to the Ferry*/
    public void load(Car c){
        load.load(c);
    }
    /**Loads a car to the Ferry*/
    public void unload(){
        load.unload();
    }
    @Override
    public double speedFactor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
