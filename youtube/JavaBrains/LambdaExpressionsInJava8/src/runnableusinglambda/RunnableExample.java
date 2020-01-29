/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnableusinglambda;

/**
 *
 * @author murad_isgandar
 */
public class RunnableExample {
    
    public static void main(String[] args) {
        
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello World");
            }
            
        });
        
        t.run();
        
        Thread t1 = new Thread(()->System.out.println("Hello World"));
        t1.run();
        
    }
}
