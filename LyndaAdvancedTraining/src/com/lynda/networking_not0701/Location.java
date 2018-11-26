/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.networking_not0701;

/**
 *
 * @author root
 */
public class Location {

    private String street;
    private String city;
    private String state;

    private boolean latitude;
    private boolean longitude;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isLatitude() {
        return latitude;
    }

    public void setLatitude(boolean latitude) {
        this.latitude = latitude;
    }

    public boolean isLongitude() {
        return longitude;
    }

    public void setLongitude(boolean longitude) {
        this.longitude = longitude;
    }

}
