/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author root
 */
public class ProducerConsumerUse {

    public static void main(String[] args) {

        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        Producer p1 = new Producer(1, queue);
        //Producer p2 = new Producer(2, queue);

        Consumer c1 = new Consumer(1, queue);
        //Consumer c2 = new Consumer(2, queue);

        ExecutorService service = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());

        service.execute(p1);
        //service.execute(p2);

        service.execute(c1);
        // service.execute(c2);

        service.shutdown();
    }
}
