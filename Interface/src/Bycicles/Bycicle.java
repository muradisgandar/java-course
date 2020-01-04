/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bycicles;

import beans.Driveable;

/**
 *
 * @author murad_isgandar
 */
public abstract class Bycicle implements Driveable{
     @Override
    public void drive(double speed) {
        System.out.println(this.getClass().getName() + " is driving by " + speed + " km/h ");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getName() + " has been stoped ");
    }

    @Override
    public void park() {
        System.out.println(this.getClass().getName() + " has been parked ");

    }
    
    
    
}
