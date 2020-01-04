/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import threads.MyCallable;
import threads.MyRunnable;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
    public static int i = 0;
    
    
    
    public static synchronized void increase(int i){
        Main.i++;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exc = Executors.newCachedThreadPool();

        //Callable<Car> r = new MyCallable("Text 1");
//        Runnable r = new MyRunnable("Test 1");
//        long begin = System.currentTimeMillis();
            Runnable r = new MyRunnable();
        for (int i = 0; i < 5; i++) {
            //Future<Car> f =  exc.submit(r);
            //Car c = f.get();
//            Thread t = new Thread(new MyRunnable());
//            t.start();
            exc.execute(r);

        }
        awaitTerminationAfterShutdown(exc);
        System.out.println("i last= " + i);

//        awaitTerminationAfterShutdown(exc);
//        long end = System.currentTimeMillis();//NWS5514  NC5641 NFX 8000
//        
//        System.out.println(end-begin);
    }

    public static void awaitTerminationAfterShutdown(ExecutorService threadPool) {
        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                threadPool.shutdownNow();
            }
        } catch (InterruptedException ex) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

}
