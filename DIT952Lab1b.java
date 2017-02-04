package dit952.lab.b;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dit952.lab1b;

/**
 *
 * @author Asus
 */
public class DIT952Lab1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CarTransporter ct=new CarTransporter(1,1);
       Car c=new Saab95(10,10);
       Car c2=new Saab95(20,20);       
       Car c3=new Volvo240(30,30);       
       Car c4=new Volvo240(40,40);              
       Car c5=new Volvo240(55,55);
       ct.startEngine();
       ct.load(c);
       ct.load(c2);
       ct.load(c3);
       ct.gas(1);
       ct.move();
       ct.move();
        System.out.println(c.getXPos()+" "+c.getYPos());
       
       
       
    }
    
}
