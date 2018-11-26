/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author root
 */
public class HrDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("shady"), new Employee("salah"),
                new Employee("bassem"), new Employee("said")
        );

        List<Salaried> salarieds = Arrays.asList(
                new Salaried("shady"), new Salaried("salah"),
                new Salaried("bassem"), new Salaried("said")
        );

        System.out.println(employees);
        System.out.println(salarieds);

//        Hr.printEmpNames(employees);
        //  Hr.printEmpNames(salarieds);  not compiled

        // Hr.printEmpAndSubClassName(salarieds);
        
        Hr.printAllFiltered(employees, 
                e -> e.toString().length() % 2 == 0);
    
    
        // PECS : preducer uses extends  , consumer uses super 
    }
}
