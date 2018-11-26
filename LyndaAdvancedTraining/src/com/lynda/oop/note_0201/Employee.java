/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.oop.note_0201;

import java.time.LocalDate;

/**
 *
 * @author root
 */
public abstract class Employee {

    public static final String DEFULT_NAME = "unknown";
    private static int nextId;

    private Integer id;
    private String name;
    private LocalDate hireDate;

    // invoke constructor in another constructor in same class
    // when invoke this constractur it will invoke public Employee(String name) ....
    public Employee() {
        this(DEFULT_NAME);
    }

    public Employee(String name) {

        id = nextId++;
        this.name = name;
        hireDate = LocalDate.now();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPay();

    @Override
    public String toString() {

        return String.format("Employee{id %d , name %s , hireDate %s }", id, name, hireDate);
    }

}
