/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class SortingDemo {
 
        private List<String> sampleStrings = Arrays.asList("shady" , "salah" , "said");

        // Defult Sorting from java7
        public List<String> alphaSort(){
        
            Collections.sort(sampleStrings);
            return sampleStrings;
        }
        
        // java 7 using comparator
        public List<String> lengthReverseSortWithComparator(){
        
            Collections.sort(sampleStrings, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {

                    return s2.length() - s1.length();
                }
            });
            return sampleStrings;
        }
        
        //using lampda as comparator
          public List<String> lengthReverseSortWithLambda(){
        
            Collections.sort(sampleStrings,
                    (s1,s2) -> s1.length() - s2.length());
            return sampleStrings;
        }
         
          //verbose syntax for length sort 
            public List<String> lengthReverseSortVerbose(){
        
            Collections.sort(sampleStrings, 
                    Comparator.comparingInt(String::length));
            return sampleStrings;
        }
            
            //length sort , then alphabitical
             public List<String> lengthReverseSortThenAlphabitical(){
        
            Collections.sort(sampleStrings, 
                    Comparator.comparingInt(String::length)
                    .thenComparing(Comparator.naturalOrder()));
            return sampleStrings;
        }
             
             // using sorted to stop modifying collection
             public List<String> alphaSortUSingSorted(){
             
                 return sampleStrings.stream()
                         .sorted()
                         .collect(Collectors.toList());
                         
             }
             
             // sort bu length with sorted
              public List<String> lengthSortUSingSort(){
             
                 return sampleStrings.stream()
                         .sorted( (s1,s2) -> s1.length() - s2.length())
                         .collect(Collectors.toList());
                         
             }
              
              // sort by length then alpha using sorted
               public List<String> lengthSortThentAlphaSortUsingSorted(){
             
                 return sampleStrings.stream()
                         .sorted( Comparator.comparing(String::length)
                         .thenComparing(Comparator.naturalOrder()))
                         .collect(Collectors.toList());
                         
             }
              
             
             
        
}

