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
public class LambdasDemo {

    public static void main(String[] args) {

        // foreach takes consumer 
        //stream is seqqance of valuse that not modivied and not stored anywhere
        Stream.of(1, 2, 3, 5, 4)
                .forEach(n -> System.out.print(n));

        System.out.println("");

        // the same but it's lambda completed form
        Stream.of(1, 2, 3, 5, 4)
                .forEach((Integer n)
                        -> {
                    System.out.print(n);

                });

        System.out.println("");

        // the same
        Stream.of(1, 2, 3, 5, 4)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer t) {

                        System.out.print(t);
                    }
                });

        System.out.println("");

        // Define Consumer Separatly
        Consumer<Integer> printer = n -> System.out.print(n);
        Stream.of(1, 5, 2, 3, 4)
                .forEach(printer);

    }
}
