/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.stream.IntStream;

/**
 *
 * @author root
 */
public class LazyStreams {
    
    public static int multByTwo(int n){
    
        System.out.printf("Inside multyByTwo With arg %d%n" ,n);
        return n*2;
    }
    
    public static void main(String[] args) {
        
        //find first even double between 200 & 400 divisable by 3
        int firstDoubleDividBy3 = IntStream.range(100, 200)
                .map(LazyStreams::multByTwo)
                .filter( n-> n % 3 == 0)
                .findFirst()
                .orElse(999);
                System.out.printf("first even divisable by 3 is %d%n" ,firstDoubleDividBy3);

                //mark : collection (cant processing on it's element)
                //       Stream (Can) => benfites
    }
}
