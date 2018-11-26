/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.networking_not0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class GeoCoder {

    private final static String BASE = "https://maps.googleapis.com/maps/api/geocode/json?";

    ////https://developers.google.com/maps/documentation/geocoding/intro (show explaination)
    //Geocoding is the process of converting 
    //addresses (like "1600 Amphitheatre Parkway, Mountain View, CA") 
    //into 
    // geographic coordinates  (like latitude 37.423021 and longitude -122.083739 ==> (i think x ,y => gps) 
    // which you can use to place markers on a map, or position the map.
    
    
    // Function <String, String> :  string in (s) and string out (URLEncoder.encode(s, "UTF-8");)
    private static Function<String, String> encoder = s -> {

        try {

            return URLEncoder.encode(s, "UTF-8");

        } catch (UnsupportedEncodingException ex) {

            ex.printStackTrace();
        }
        return null;
    };

    public static String encodeAdrress(List<String> address) {

        return address.stream()
                .map(encoder)
                .collect(Collectors.joining(","));
    }

    // get jeson data
    public static String getData(List<String> address) {

        String encoded = encodeAdrress(address);
        String response = "";

        try {

            URL url = new URL(String.format("%saddress%s", BASE, encoded));

            //openStream : open connection and return input stream to read from this connection
            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {

                // thean iam reading from this url
                String line = "";
                while ((line = br.readLine()) != null) {

                    response += "\n" + line;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return response;
    }
    
    public void fillInLatLan(Location location){
    
        String encoded = encodeAdrress(Arrays.asList(location.getState() , location.getCity() , location.getState()));
        
        try {

            URL url = new URL(String.format("%saddress%s", BASE, encoded));

            //openStream : open connection and return input stream to read from this connection
            try ( InputStream is =url.openStream() ) {
                
                Json

                // thean iam reading from this url
                String line = "";
                while ((line = br.readLine()) != null) {

                    response += "\n" + line;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
