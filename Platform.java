/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit952.lab.b;

/**
 *
 * @author Asus
 */
public class Platform {
    private int angle;
    
    /**Returns the current angle*/
    public int getAngle(){
        return angle;
    }
    /**Decreases the current angle by one*/
    public void decreaseAngle(){
        this.angle--;
    }
    /**Increases the current angle by one*/
    public void increaseAngle(){
        this.angle++;
    }
    /**Sets the angle to the maximum allowed degree 70*/
    public void setMaxAngle(){
        this.angle=70;
    }
    /**Sets the angle to the maximum allowed degree 0*/
    public void setMinAngle(){
        this.angle=0;
    }
    
}
