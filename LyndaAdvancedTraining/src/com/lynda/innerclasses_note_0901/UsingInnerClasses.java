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
public class UsingInnerClasses {

    public static void main(String[] args) {

        new Outer().new Inner().myMethod(); 
        new Outer.StaticInner().myMethod();

    }
}
