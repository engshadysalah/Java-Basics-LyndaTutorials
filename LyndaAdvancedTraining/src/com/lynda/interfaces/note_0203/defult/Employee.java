/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.interfaces.note_0203.defult;

/**
 *
 * @author root
 */
public interface Employee {
    
    String getFirst();
    String getLast();
    
    void doWork();
    
    default String getName(){
    
        return String.format("%s %s ", getFirst() , getLast());
    }
}
