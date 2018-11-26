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
public class Tuple <T,U> {
    
    private T first;
    private U secound;

    public Tuple(T first, U secound) {
        this.first = first;
        this.secound = secound;
    }
    
    public T getFirst() {
        return first;
    }


    public U getSecound() {
        return secound;
    }

    @Override
    public String toString() {
        return String.format("Tuple{first %s , secound %s}", first , secound);
    }
 

    
    
    
    
}
