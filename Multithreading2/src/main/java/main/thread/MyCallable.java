/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author murad_isgandar
 */
public class MyCallable implements Callable<Object> {


    @Override
    public Object call() throws Exception {
        doIt();
        return this;
    }

    private void doIt() {
        System.out.println("runable ishe dushdu ve 3 san gozleyecek");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("runnable ishi bitirdi");
    }

}
