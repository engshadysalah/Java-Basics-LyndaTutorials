/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.blockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author root
 */
public class Producer implements Runnable {
    
    private int id;
    private BlockingQueue<Message> queue;
    
    public Producer(int id, BlockingQueue<Message> queue) {
        this.id = id;
        this.queue = queue;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 100; i++) {
            
            Message m = new Message(i);
            
            try {
                System.out.printf("Producer %d produced %d%n", id, m.getId());
                queue.put(m);
                Thread.sleep((long) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        try {
            queue.put(new Message(-1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
