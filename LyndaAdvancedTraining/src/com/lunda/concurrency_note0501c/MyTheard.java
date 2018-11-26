/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501c;

/**
 *
 * @author root
 */
public class MyTheard extends Thread{
    
    private int id ;

    public MyTheard(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("hello "+this);
    }

    @Override
    public String toString() {
        return String.format("MY thread :{id=%d}",id);
    }
    
    
}
