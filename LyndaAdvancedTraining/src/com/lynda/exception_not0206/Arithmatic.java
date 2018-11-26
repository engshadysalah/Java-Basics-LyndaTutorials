/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.exception_not0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Arithmatic {

    public static void main(String[] args) {

    }

    static private void note1() {

        int x = 3;
        int y = 0;
        double z = 0;

        try {

            z = x / y;

        } catch (ArithmeticException ex) {

//            ex.printStackTrace();
            System.out.println(ex);
            // return; // then if exception occure then stop here without excuting other lineof code that out of try{} (like system.exit)

        } finally {
            System.out.println("called in any case");
        }

        System.out.printf("x:%d , y:%d , z=%s%n", x, y, z);
    }

    static private void note1_1() {

        int x = 3;
        int y = 0;
        double z = 0;

        try {

            z = x / y;

            // if exception occure and it not catched 
            // finally is called then exception occure
        } finally {
            System.out.println("called in any case");
        }

        System.out.printf("x:%d , y:%d , z=%s%n", x, y, z);
    }

    static private void note2() {

        try {

            Arithmatic.class.newInstance();

            // multi cash is can be as :
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Arithmatic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static private void note3() {

        // sourth of perant : /home/shady/Desktop
        Path dir = Paths.get("home", "shady", "Desktop");

        // file name /Linkis.txt
        try (BufferedReader br = Files.newBufferedReader(dir.resolve("Linkis.txt"))) {

            while (true) {
                System.out.println(br.readLine());
            }

        } catch (IOException ex) {
            ex.printStackTrace();

            // file will closed automaticlly
            // becouse it opended in try block
//        } finally {
//
//            try {
//                if (br != null) {
//                    br.close();
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(Arithmatic.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

    static private void note4() {

        try {

            throw new MyExecption();

        } catch (MyExecption ex) {
            System.out.println(ex.getMessage());
        }
    }

    static private void importantComment() {
        /*
    
    // formats :
    
        %s ==> String
        %d ==> digit
        %s%n ==> char and digit (numberFormate or double)
       
    // difference between printf & String.format :
    
        System.out.printf("x:%d , y:%d , z=%s%n", x, y, z);

        String format = String.format("x:%d , y:%d , z=%s%n", x, y, z);
        System.out.println(format);

         */
    }

}
