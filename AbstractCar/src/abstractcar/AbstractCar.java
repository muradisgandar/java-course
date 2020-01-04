/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractcar;

/**
 *
 * @author murad_isgandar
 */
public abstract class AbstractCar {
    
    public int a;
    public void stopAndAlert(){
        stop();
        alert();
    }
    
    
    public abstract void drive();
    
    public abstract void stop();
    
    public abstract void park();
    public abstract void alert();
}
