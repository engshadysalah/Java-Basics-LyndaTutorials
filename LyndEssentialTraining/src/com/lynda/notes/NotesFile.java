/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.notes;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
// import org.apache.commons.io.FileUtils;

/**
 *
 * @author root
 */
public class NotesFile {

    public static void main(String[] args) {

        Path sourceFile = Paths.get("");

        Path destFile = Paths.get("");

        // java 7
        // Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
        //or
        //FileUtils.copy(new File("source"), new File("des"));
    }

    public void readingFileOverNet() {

        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {

            URL url = new URL("http://services.......");

            inputStream = url.openStream();

            bufferedInputStream = new BufferedInputStream(inputStream);

            StringBuilder builder = new StringBuilder();

            while (true) {

                int data = bufferedInputStream.read();
                if (data == -1) {
                    break;
                } else {
                    builder.append((char) data);
                }
            }

            inputStream.close();
            bufferedInputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
