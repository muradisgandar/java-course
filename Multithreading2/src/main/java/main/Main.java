/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import main.thread.MyCallable;
import main.thread.MyRunnable;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        MyCallable[] arr = new MyCallable[3];
        arr[0] = new MyCallable();
        arr[1] = new MyCallable();
        arr[2] = new MyCallable();
        
        List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
        
        System.out.println("terminated");

    }
    
    private static void scheduledThreadPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(1);
        ex.schedule(new MyRunnable(), 3, TimeUnit.SECONDS);
    }
    

    private static void cachedThreaddPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool();
    }

    public static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
    }

    public static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable());
        }
    }
}
