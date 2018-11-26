/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class MethodTefrencesDemo {
    
    public static void main(String[] args) {
        
        Stream.of(1,4,2,3)
                .forEach(System.out::println);
        
          Stream.of(1,4,2,3)
                .forEach(n -> System.out.println(n));
          
        
        Consumer<Integer> printer = System.out::println;
        Stream.of(1,2,5,4,9)
                .forEach(printer);
    }
}
