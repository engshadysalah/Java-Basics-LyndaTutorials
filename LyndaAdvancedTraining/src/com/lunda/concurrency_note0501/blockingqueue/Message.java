/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.blockingqueue;

/**
 *
 * @author root
 */
public final class Message {
    
    private final int id;

    public Message(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    
}
