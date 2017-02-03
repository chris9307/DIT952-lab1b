package dit952.lab.b;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dit952.lab1;
/**
 *Contains methods for movable objects.
 * @author Asus
 */
public interface Movable {
   
    /**
     *Make the object move in the current direction of the object.
     */
    void move();

    /**
     *Make the object change direction 90 degrees to the left from its current direction.
     */
    void turnLeft();

    /**
     *Make the object change direction 90 degrees to the right from its current direction.
     */
    void turnRight();
}