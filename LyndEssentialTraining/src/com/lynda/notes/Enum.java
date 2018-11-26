/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.notes;

/**
 *
 * @author root
 */
public enum Enum {

    fName("shady"),
    lName("Salah");

    private String name;

    Enum(String name) {
        this.name=name;
    }

    @Override   
    public String toString() {
        return name;
    }

 static class test{
  
      public static void main(String[] args) {
          
          System.out.println(Enum.fName.toString());
          System.out.println(Enum.lName.toString());
      }
  }

}
