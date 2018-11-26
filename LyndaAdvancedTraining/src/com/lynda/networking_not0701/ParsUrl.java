/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.networking_not0701;

import java.io.IOException;
import java.net.URL;

/**
 *
 * @author root
 */
public class ParsUrl {

    public static void main(String[] args) {
        try {

            //protocol://host:port/path?query#ref
            URL url = new URL("http://docs.oracle.com80/javase/8/docs/api/?q=ss&x=hh#Reference");
            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
