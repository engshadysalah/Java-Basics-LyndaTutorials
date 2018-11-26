/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class CollectionsDemo {

    private List<Integer> nums = Arrays.asList(2, 3, 1, 5, 4, 6, 0, 9, 7, 3);

    private Function<Integer, Integer> doubler = n -> n * 2;

    private Function<Integer, Integer> doubleWithSleep = n -> {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        return n * 2;
    };

    public void printNumbers(Function<Integer, Integer> function) {

        System.out.println(nums.stream()
                .map(function)
                .collect(Collectors.toList()));
    }

    public void printNumbersPallel(Function<Integer, Integer> function) {

        System.out.println(nums.parallelStream()
                .map(function)
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {

        CollectionsDemo demo = new CollectionsDemo();

        long start = System.nanoTime();
        demo.printNumbers(demo.doubler);

        long end = System.nanoTime();
        System.out.println("Time Taken : " + (end - start) / 1e9);

        start = System.nanoTime();
        demo.printNumbers(demo.doubleWithSleep);
        end = System.nanoTime();
        System.out.println("Time Taken : " + (end - start) / 1e9);

         start = System.nanoTime();
        demo.printNumbersPallel(demo.doubleWithSleep);
        end = System.nanoTime();
        System.out.println("Time Taken : " + (end - start) / 1e9);

    }
}
