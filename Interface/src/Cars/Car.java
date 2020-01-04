/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import beans.Driveable;

/**
 *
 * @author murad_isgandar
 */
public abstract class Car implements Driveable{
    

    @Override
    public void stop() {
        System.out.println(this.getClass().getName() + " has been stoped ");
    }

    @Override
    public void park() {
        System.out.println(this.getClass().getName() + " has been parked ");

    }
    
}
