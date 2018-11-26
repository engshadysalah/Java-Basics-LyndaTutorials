/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunda.concurrency_note0501c;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class UseMyTheard {

    public static void main(String[] args) {

        List<MyTheard> threads = Stream.iterate(0, n -> n + 1)
                .map(MyTheard::new)
                .limit(10)
                .collect(Collectors.toList());
        
        
        threads.forEach(Thread::start);
        
//        MyTheard mt = new MyTheard(1);
//        mt.start();
    }
}
