/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.interfaces.note_0203.defult;

/**
 *
 * @author root
 */
public class ComanyEmployee implements Company, Employee {

    private String first;
    private String last;

    @Override
    public String getName() {
        return String.format(" %s Working for  %s", Employee.super.getName(), Company.super.getName());
    }

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public String getLast() {
        return last;
    }

    @Override
    public void doWork() {
        System.out.println("Working .... ");
    }

}
