/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class UsePerson {
    
    private List<String> names = Arrays.asList("shady" , "salah" , "said");
    
    public List<PersonClass> createPersonList(){
    
        return names.stream()
                .map(name -> new PersonClass(name))
                .collect(Collectors.toList());
    }
    
    public PersonClass[] createPersonArray(){
    
        return names.stream()
                .map(PersonClass::new)
                .toArray(PersonClass[]::new);
    }
    
      public  List<PersonClass>  createPersonUsingNew(){
    
        return names.stream()
                .map(PersonClass::new)
                .collect(ArrayList::new ,ArrayList::add,ArrayList::addAll);
    }
      
      public static void main(String[] args) {
        
          UsePerson up= new UsePerson();
          System.out.println(up.createPersonList());
          System.out.println(up.createPersonUsingNew());
          Arrays.stream(up.createPersonArray())
          .forEach(System.out::println);
    }
    
}
