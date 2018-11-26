/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.oop.note_0201;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Hr {
    
    public List<Employee> employees = new ArrayList<>();
    
    public void hire(Employee e) {
        
        employees.add(e);
    }
    
    public void layoff(Employee e) {
        
        employees.remove(e);
    }
    
    public List<Employee> getEmployess() {
        
        return employees;
    }
    
    public void printEveryBody(){
    
        employees.forEach(System.out::println);
    }
    public void payEveryBody() {
        
        for (Employee employee : employees) {
            
            System.out.printf("Paying %s %s%n", employee.getName() ,
                    NumberFormat.getCurrencyInstance().format(employee.getPay()));
            
        }
    }
}
