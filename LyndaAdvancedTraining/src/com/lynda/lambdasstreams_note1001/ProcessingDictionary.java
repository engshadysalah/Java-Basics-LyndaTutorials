/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

/**
 *
 * @author root
 */
public class ProcessingDictionary {
    
    public static void main(String[] args) throws Exception{
        
        Files.lines(
                //  /home/shady/Desktop/TestPaths
                Paths.get("/","home","shady","Desktop","TestPaths","file1"))
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(10)
                .forEach( (String w) ->
                        System.out.printf("%s (%d)%n",w,w.length()));
        
                
         Optional<String> max=    Files.lines(
                //  /home/shady/Desktop/TestPaths
                Paths.get("/","home","shady","Desktop","TestPaths","file1"))
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(10)
                 .findFirst();
     
         
         System.out.println(max.isPresent() ? max.get() : max.orElse("Non found"));
         
         System.out.println(max.orElseGet(() -> "Nothing"));
         
         System.out.println(max.orElse("nothing"));
    }
    
}
