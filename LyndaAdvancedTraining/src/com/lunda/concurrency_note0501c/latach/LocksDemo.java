/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501c.latach;

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
    
    public void demoCounter(){
    
        ExecutorService services = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
        .forEach(i -> services.submit(counter::incremnt));
        
        services.shutdown();
        
        System.out.println("Counter count = "+counter.getClass());
    }
}
