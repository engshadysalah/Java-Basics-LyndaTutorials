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
public class Consumer implements Runnable {

    private int id;
    private BlockingQueue<Message> queue;

    public Consumer(int id, BlockingQueue<Message> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {

        Message m;
        try {
            while ((m = queue.take()).getId() != -1) {

                System.out.printf("Consumer %d consumed %d%n", id, m.getClass());
                Thread.sleep((int) (Math.random() * 100));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
