/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.oop.note_0201;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author root
 */
public class CurrencyPrinter {

    public static void main(String[] args) {

        double amount = 1234567.9801234;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(amount));

        System.out.println(nf.getClass().getName());
        
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(nf2.format(amount));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf3.format(amount));
    }
}
