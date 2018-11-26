/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.exception_not0206;

/**
 *
 * @author root
 */
public class MyExecption extends Exception{

    public MyExecption() {
        this("defult Exception");
    }

    public MyExecption(String message) {
        super(message);
    }
    
}
