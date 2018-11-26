/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.networking_not0701;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class LocalAddress {

    public static void main(String[] args) {

        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            Logger.getLogger(LocalAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
