/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.notes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class DateNotes {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("Current Date  is : " + date);

        // Question : How to convert String To Date
        // Convert Date To String :
        // Date Formate (1) :
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Current DateFormate  is : " + df.format(date));
        String format = df.format(date);

        //or
        // Date Formate (1) :
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
        System.out.println("Current DateFormate  is : " + dateFormat.format(date));

        ////////////////////    (Add 2 Dates)    /////////////////
        GregorianCalendar gc = new GregorianCalendar(2010, 1, 28);

        System.out.println("Date before Addetion is : " + gc.getTime());

        gc.add(GregorianCalendar.DATE, 1);

        Date newDate = gc.getTime();

        System.out.println("Date after Addetion is : " + newDate);

        /////////////////    (Local Date)    //////////////////////////
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2010, 1, 28);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

///////////////////////////////////////
        SimpleDateFormat d = new SimpleDateFormat("yyyy : mm : dd");
        String stringFormatedDate = d.format(new Date());
        System.out.println(stringFormatedDate);
//        try {
//             DateFormat f = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
////            Date FormatedDate = f.parse(stringFormatedDate);
//           // System.out.println(FormatedDate);
//            //   System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
//        } catch (ParseException ex) {
//            Logger.getLogger(DateNotes.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
