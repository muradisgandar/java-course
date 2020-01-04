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
public class BMW extends AbstractCar {

    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }

    @Override
    public void stop() {
        System.out.println("BMW is stoped");
    }

    @Override
    public void park() {
        System.out.println("BMW is parked");
    }

    @Override
    public void alert() {
        System.out.println("BMW is alerting you");
    }

}
