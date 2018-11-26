/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author root
 */
public class TupleModel {

    public static void main(String[] args) {
        
        Tuple<Integer , String> t=new Tuple<>(1,"hello");
        
        System.out.println(t);
        
        Tuple<LocalDate , List<String>> tuple=new Tuple<>(LocalDate.now() , Arrays.asList("a","b","c"));
        System.out.println(tuple);
    }
    
}
