/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class Sumerizaing {
    
    public static void main(String[] args) {
        
        DoubleSummaryStatistics statistics = Stream.generate(Math::random)
                .limit(1000)
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        
        System.out.println(statistics);
    }
}
