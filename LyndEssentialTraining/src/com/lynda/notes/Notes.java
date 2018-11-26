/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.notes;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Notes {

    public static void main(String[] args) {

        NewClass obj = new NewClass();

        obj.setNumber(NewClass.sharNumber);

        System.out.println(obj.getNumber());

    }

    // done("1","2","3","4","5");
    static void done(String... names) {

        for (String name : names) {
            System.out.println("NAME : " + name);
        }
    }

    //calculator();
    static void calculator() {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Number 1 : ");

            int fNumber = Integer.parseInt(scanner.next());

            System.out.println("Number 2 : ");

            int sNumber = Integer.parseInt(scanner.next());

            System.out.println("Chisse the operatore * / + -");

            String operator = scanner.next();

            switch (operator) {

                case "*":
                    System.out.println("Multip is : " + (fNumber * sNumber));
                    break;

                case "/":
                    System.out.println("Devision is : " + (fNumber / sNumber));
                    break;

                case "+":
                    System.out.println("Addition is : " + (fNumber + sNumber));
                    break;

                default:
                    System.out.println("Ronge Chicess");
            }

        } catch (Exception e) {
            System.out.println("Error becouse of : " + e.getMessage());
            //e.printStackTrace();
        }
    }

    //copiedArray();
    static void copiedArray() {

        int[] numbers = {1, 2, 11, 22};

        int[] copyed = new int[3];

        //(arrSource , coby from index , desArray , coby in index , lenth of nubers that copyed)
        System.arraycopy(numbers, 1, copyed, 0, 3);

        for (int newNuber : copyed) {

            System.out.println(newNuber);
        }
    }

    //towDArray_1();
    static void towDArray_1() {

        String[][] states = new String[3][2];

        states[0][0] = "Egypt";
        states[0][1] = "Cairo";
        states[1][0] = "Countery";
        states[1][1] = "city";
        states[2][0] = "USA";
        states[2][1] = "Amirica";

        for (int i = 0; i < states.length; i++) {

            StringBuilder builder = new StringBuilder();

            builder.append("The city of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(" .");

            System.out.println(builder);
        }
    }

    //towDArray_2();
    static void towDArray_2() {

        String[][] states = new String[3][2];

        states[0][0] = "Egypt";
        states[0][1] = "Cairo";
        states[1][0] = "Countery";
        states[1][1] = "city";
        states[2][0] = "USA";
        states[2][1] = "Amirica";

        for (int i = 0; i < states.length; i++) {

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < 2; j++) {

                System.out.print(states[i][j] + " :  ");

            }
            System.out.println("\n----------------");

        }

    }

    
}
