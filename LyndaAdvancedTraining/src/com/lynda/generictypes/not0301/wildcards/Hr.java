/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301.wildcards;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author root
 */
public class Hr {

    public static void printEmpNames(List<Employee> employees) {

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    // accept arg that is sublcass fo Employee ==>    <? extends Employee>  Or accept arg that is (type : Employee)
   // ? means generic
    public static void printEmpAndSubClassName(List<? extends Employee> employees) {

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

       // employees.add(new Employee("ss")); not compiled
       // employees.add(new Salaried("ss")); not compiled
       
    }

    public static void printAllFiltered(
            List<? extends Employee> employees, Predicate<? super Employee> predicate) {

        for (Employee e : employees) {

            // print name that is length is even
            if (predicate.test(e)) {
                System.out.println(e.getName());
            }
        }

    }
}
