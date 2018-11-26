/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.locks;

/**
 *
 * @author root
 */
public class SyncCounter {
    
      
    private int count ;
    
    public synchronized void increment(){
    
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
