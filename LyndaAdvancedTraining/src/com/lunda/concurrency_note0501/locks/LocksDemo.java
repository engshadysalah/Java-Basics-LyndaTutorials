/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.locks;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 *
 * @author root
 */
public class LocksDemo {
    
    private Counter counter=new Counter();
    
        private SyncCounter synCounter=new SyncCounter();
private LockCounter lockCounter=new LockCounter();
    public void demoConter(){
    
        ExecutorService service=Executors.newCachedThreadPool();
        IntStream.range(0, 1000)      // submit takes runablr or callable 
                .forEach(i -> service.submit(counter::increment));
        service.shutdown();
        System.out.println("Counter count = "+counter.getCount());
    }
    
      
    public void demoSynConter(){
    
        ExecutorService service=Executors.newCachedThreadPool();
        IntStream.range(0, 1000)      // submit takes runablr or callable 
                .forEach(i -> service.submit(counter::increment));
        service.shutdown();
        System.out.println("SynchCounter count = "+synCounter.getCount());
    }
    
    
    public void demoAutomaticConter(){
    
        ExecutorService service=Executors.newCachedThreadPool();
        IntStream.range(0, 1000)      // submit takes runablr or callable 
                .forEach(i -> service.submit(counter::increment));
        service.shutdown();
        System.out.println("AutomaticConter count = "+lockCounter.getCount());
    }
    
    public static void main(String[] args) {
        
        LocksDemo demo = new LocksDemo();
        demo.demoConter();
        demo.demoSynConter();
        demo.demoAutomaticConter();
    }
}
