/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 *
 * @author root
 */
public class FileFilterDemo {

    public static void main(String[] args) {

        File sourceDirectory = new File("/home/shady/Desktop/TestPaths");

        System.out.println("==================== using anonymous inner classes ====================");

        // using anonymous class 
        for (String name : sourceDirectory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        })) {
            System.out.println("==>  " + name);
        }

        //using lambda expersion : the same
        Arrays.stream(sourceDirectory.list((directory, name) -> name.endsWith(".xml")))
                .forEach(System.out::println);

        // Assign lambda to Variable 
        FilenameFilter javaFilter = (dirr, name) -> name.endsWith(".xml");

        Arrays.stream(sourceDirectory.list(javaFilter))
                .forEach(System.out::println);

    }
}
