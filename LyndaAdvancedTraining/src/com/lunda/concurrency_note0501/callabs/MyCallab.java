/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.callabs;

import java.util.concurrent.Callable;

/**
 *
 * @author root
 */
public class MyCallab implements Callable<String> {

    private int id;

    public MyCallab(int id) {
        this.id = id;
    }

    
    // callable like thread but (runable is void not return bu call can return String)
    @Override
    public String call() throws Exception {

        return String.format("%s using thread %s", this, Thread.currentThread().getName());
    }


    @Override
    public String toString() {
        return String.format("mycallable {id = %d}",id);
    }

}
