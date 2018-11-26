/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author root
 */
public class StringSorterDemo {

    public static void main(String[] args) {
        StringSorter ss = new StringSorter();

        List<String> strings = Arrays.asList("this", "list", "of", "strings");

        ss.setStrings(strings);
        System.out.println("Befor sorting : " + strings);
        
        System.out.println("after sorting : " + ss.lengthSort());
        
        System.out.println("after revarse sorting : "+ss.lengthReverseSorterWithStream());
    }
}
