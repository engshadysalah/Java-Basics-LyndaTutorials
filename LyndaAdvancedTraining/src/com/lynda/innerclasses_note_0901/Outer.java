/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

/**
 *
 * @author root
 */
public class Outer {

    private static int anInt;
    private static String string;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public class Inner {

        public void myMethod() {
            System.out.println("anInt = " + anInt + "  string = " + string);
        }
    }

    public static class StaticInner {

        public void myMethod() {
             System.out.println("inside static inner class");
        }
    }

}
