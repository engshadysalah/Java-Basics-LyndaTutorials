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
public class UseHr {

    public static void main(String[] args) {

        Hr hr = new Hr();

        hr.hire(new Salaried("Fred"));
        hr.hire(new Salaried("Bareny"));
        hr.hire(new Salaried());
        hr.hire(new Salaried());
        hr.printEveryBody();
        hr.payEveryBody();

    }
}
