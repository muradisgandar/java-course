/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author murad_isgandar
 */
public interface Driveable {

    default void drive(double speed){
        System.out.println(this.getClass().getName() + " is driving by " + speed + " km/h ");
    }

    void stop();
    
    void park();
    
    public static final int A = 6;
    
    
}
