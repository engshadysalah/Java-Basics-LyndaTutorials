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
public class JavaFilter implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(".xml");
        
    }
    
}
