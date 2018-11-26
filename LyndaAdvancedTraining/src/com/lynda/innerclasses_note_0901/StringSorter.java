/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class StringSorter {

    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<String> naturalSort() {
        Collections.sort(strings);
        return strings;
    }

    public List<String> naturalSortWithStream() {

        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> lengthSort() {

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                return s1.length() - s2.length();
            }
        });
        return strings;
    }
    
      public List<String> lengthReverseSorterWithLamda(){
    
        return strings.stream() 
                .sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))  // this is lamda 
                .collect(Collectors.toList());
                
    }
      
    public List<String> lengthReverseSorterWithStream(){
    
        return strings.stream() 
                .sorted((s1,s2) -> Integer.compare(s2.length(), s1.length()))  // this is lamda 
                .collect(Collectors.toList());
                
    }
    
}
