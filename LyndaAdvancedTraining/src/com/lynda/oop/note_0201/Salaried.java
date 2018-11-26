/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.oop.note_0201;

/**
 *
 * @author root
 */
public class Salaried extends Employee {

    public static final double DEFULT_SALARY = 12000;

    private double salary = DEFULT_SALARY;

    public Salaried() {
        // if defult constructor in Employee is removed
        //then : problem will be in defult constructor Salaried
       
        //super(); by defult
    }

    public Salaried(String name) {

        this(name, DEFULT_SALARY);
        // new Salaried(name,DEFULT_SALARY);

    }

    public Salaried(String name, double salary) {

        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary / 24;
    }

}
