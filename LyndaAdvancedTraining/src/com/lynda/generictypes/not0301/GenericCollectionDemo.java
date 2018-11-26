/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class GenericCollectionDemo {

    
    public static void main(String[] args) {
      
        noGeneric();
        
        generic();
    }
    
    static void noGeneric() {

        List nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add("oops");

        System.out.println(nums);

        for (Object num : nums) {
            System.out.println(num);
        }
    }

    static void generic() {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        // nums.add("oops");

        System.out.println(nums);
        
        for (Integer num : nums) {
            System.out.println(num);

        }
    }
}
