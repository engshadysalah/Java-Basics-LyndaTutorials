/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.interfaces.note_0203.defult;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class DefultMethodDemo {

    public static void main(String[] args) {

        List<Integer> nums = Stream.of(-3, 1, 4, -5, 2, -6)
                .collect(Collectors.toList());

        System.out.println(nums);

        // removeIf is defult method in collection 
        // return true if any elements were moved
                                      // n is each element of nums
        boolean removed = nums.removeIf(n -> n <= 0);
        
        System.out.println("Elements were  " + (removed ? "": "Not") + "removed");
        
        System.out.println(nums);
        
        nums.forEach(System.out::println);
        
       // String name = (removed) ? "": "Not";
    }
}
