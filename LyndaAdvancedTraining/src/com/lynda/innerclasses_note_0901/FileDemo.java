/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.innerclasses_note_0901;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author root
 */
public class FileDemo {

    public static void main(String[] args) {

        File dir = new File("/home/shady/Desktop/TestPaths");

        for (String name : dir.list()) {
            System.out.println(name);
        }

        System.out.println("==================== only xml fies ====================" );

        for (String name : dir.list(new JavaFilter())) {

            System.out.println("after filter    " + name);

        }

        System.out.println("==================== using anonymous inner classes ====================");

        for (String name : dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        }))
        {

            System.out.println("==>  " + name);

        }

    }
}
