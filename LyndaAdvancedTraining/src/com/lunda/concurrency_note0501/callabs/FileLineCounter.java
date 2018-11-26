/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.callabs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class FileLineCounter {

    ///home/shady/Desktop/TestPaths
    private Path dir = Paths.get(File.separator, "home", "shady", "Desktop", "TestPaths");

    public long computeTotalNumberOfLines() {

        long total = 0;
        try {

            total = executeCounters().stream()
                    .mapToLong(this::extraValueFromFuture)
                    .sum();
        }catch(InterruptedException | IOException e){
        
            e.printStackTrace();
        }
        return total;

    }

    private List<Future<Long>> executeCounters() throws InterruptedException, IOException {

        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<Long>> futures = service.invokeAll(getFileLineCounters());
        service.shutdown();

        return futures;
    }

    private List<Callable<Long>> getFileLineCounters() throws IOException {

        return Files.list(dir)
                .filter(Files::isRegularFile)
                .map(this::callablePrintingCounter)
                .collect(Collectors.toList());
    }

    private Callable<Long> callableCounter(Path p) {

        return () -> Files.lines(p).count();
    }

    private Callable<Long> callablePrintingCounter(Path p) {

        return () -> {

            long count = Files.lines(p).count();
            System.out.printf("%s has %d Lines %n", p, count);
            return count;
        };
    }
    
      //future get() throws Execptions , so catch them here
    private <T> T extraValueFromFuture(Future <T> future){
    
        T val = null;
        try{
        
            val = future.get();
        }catch(InterruptedException | ExecutionException e){
        
            e.printStackTrace();
        }
        return val;
    }
    
    
    
    public static void main(String[] args) {
        FileLineCounter demo = new FileLineCounter();
        System.out.printf("Total numbers of Lines : %d%n", 
                demo.computeTotalNumberOfLines());
    }
    
}
