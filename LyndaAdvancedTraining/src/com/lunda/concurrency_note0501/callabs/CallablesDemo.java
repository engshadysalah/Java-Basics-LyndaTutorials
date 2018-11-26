/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.callabs;

import com.lunda.concurrency_note0501c.MyRunnable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class CallablesDemo {

    public static void main(String[] args) {

        List<Callable<String>> callables = Stream.iterate(0, n -> n + 1)
                .map(MyCallab::new)
                .limit(10)
                .collect(Collectors.toList());

                                              // useing only 3 threads
        ExecutorService services = Executors.newFixedThreadPool(3);

        try {
            List< Future<String>> futures =services.invokeAll(callables);
            for (Future<String> future : futures) {

                System.out.println(future.get());
            }

            // for or stream
//            futures.stream()
//                    .map(f -> {
//                        String result = "";
//                        try {
//                            result = f.get();
//                        } catch (InterruptedException | ExecutionException ex) {
//                            ex.printStackTrace();
//                        }
//                        return result;
//                    }).forEach(System.out::print);
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(CallablesDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            services.shutdown();
        }
    }
}
