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
public class Mercedes extends AbstractCar {

    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes is stoped");
    }

    @Override
    public void park() {
        System.out.println("Mercedes is parked");
    }

    @Override
    public void alert() {
        System.out.println("Mercedes is alerting you");
    }

}
