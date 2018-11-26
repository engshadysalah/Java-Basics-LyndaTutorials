/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.networking_not0701;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author root
 */
public class GeoCoderTest {

    private GeoCoder geoCoder = new GeoCoder();

    public static void main(String[] args) {

        // conversion
        // String encoded = GeoCoder.encodeAdrress(Arrays.asList("1600 Amphitheatre Parkway", "Mountain View", "CA"));
        //System.out.println(encoded);
//           assertEqual("1600+Amphitheatre+Parkway,Mountain+View,CA",encoded);
        try {
            // jeson data
            String data = GeoCoder.getData(Arrays.asList("1600 Amphitheatre Parkway", "Mountain View", "CA"));
            System.out.println(data); // jeson
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    //https://developers.google.com/maps/documentation/geocoding/intro
    //https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=YOUR_API_KEY
    //https://maps.googleapis.com/maps/api/geocode/json?address1600+Amphitheatre+Parkway,Mountain+View,CA
//    private GeoCoder geoCoder = new GeoCoder();
//    
//    @Test
//    public void encodeAddress() throws Exception{
//    
//      String encoded=  geoCoder.encodeAdrress(Arrays.asList("1600 Amphitheatre Parkway","Mountain View","CA"));
//        
//                  assertEqual("1600+Amphitheatre+Parkway,Mountain+View,CA",encoded);
//    }
//    
//    @Test
//    public void getData() throws Exception{
//    
//      String data =geoCoder.getData(Arrays.asList("1600 Amphitheatre Parkway","Mountain View","CA"));
//      
//        System.out.println(data);
//    }
}
