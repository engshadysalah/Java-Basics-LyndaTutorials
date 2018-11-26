/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301;

/**
 *
 * @author root
 */
public class PairDemo {

    public static void main(String[] args) {

        Pair<Integer> p = new Pair<>(1, 2);
        System.out.println(p);
        p = p.swap();
        System.out.println(p);

        Pair<Integer> p2 = new Pair<>(4, 5);
        System.out.println(p2);
        p2 = p2.swap();
        System.out.println(p2);
        
        Pair.<Integer>swap(p2); //full syntax
       // or //Pair.swap(p2); //full syntax

        System.out.println(p2);
        
    }
}
