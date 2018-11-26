/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class UsingCollect {
    
    public static void main(String[] args) {
        
        
        int x=2;
        Stream.of(3,2,5,1,4)
                .mapToDouble(n->{
                       return n*x;  // || return n*2;
                       // x++; // cann't modify in lambda
                                })
                .forEach(System.out::println);
        
        List <String> strings =Arrays.asList("this","is","a","list");
       
        
        // side effects --> not what we want
        List<String> evenLengths = new ArrayList<>();
        
        strings.stream()
                .filter(s->s.length() % 2 ==0 )
                .forEach(evenLengths::add);
        System.out.println(evenLengths);
        
        
         // No side effects 
        List<String> even = strings.stream()
                .filter(s->s.length() % 2 ==0 )
                .collect(Collectors.toList());
        System.out.println(even);
        
    }
}
