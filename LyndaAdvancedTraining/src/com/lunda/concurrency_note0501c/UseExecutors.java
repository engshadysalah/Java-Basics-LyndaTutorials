/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501c;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class UseExecutors {
       public static void main(String[] args) {
        
  
    
        List<MyRunnable> runnables = Stream.iterate(0, n -> n + 1)
                .map(MyRunnable::new)
                .limit(10)
                .collect(Collectors.toList());
        
        
           ExecutorService services = Executors.newCachedThreadPool();
           
           // stream aprouch
           runnables.forEach(services::execute);
             
           // loop apruoch
//           for (MyRunnable mr : runnables) {
//               services.execute(mr);
//           }
             
             services.shutdown();
    }
}
