/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author murad_isgandar
 */
public class MyRunnable implements Runnable{
    
//    private String name;
//    private SimpleDateFormat  sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
//    
//    public MyRunnable(String name){
//        this.name = name;
//    }
    
    public void run(){
        for(int i=0;i<1000;i++){
//            System.out.println(name+" ,time: "+System.nanoTime() + " "+Thread.activeCount());
            main.Main.increase(i);
            System.out.println("i= "+i);
        }
    }
    
    
}
    

