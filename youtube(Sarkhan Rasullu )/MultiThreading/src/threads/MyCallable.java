/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
import main.Car;

/**
 *
 * @author murad_isgandar
 */
public class MyCallable implements Callable<Car>{
    private Car car;
    private String name;
    private SimpleDateFormat  sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
    public MyCallable(String name){
        this.name = name;
    }

    @Override
    public Car call() throws Exception {
        for(int i=0;i<10000;i++){
            System.out.println(name+" ,time: "+System.nanoTime() + " "+Thread.activeCount());
            
        }
        return car;
    }
    
    
}
