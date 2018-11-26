/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

/**
 *
 * @author root
 */
public class PersonClass {

    public static final String DEFULT_NAME = "UNKNOWN";

    private int id;
    private String name;

    public PersonClass() {

        this(DEFULT_NAME);
    }

    public PersonClass(String name) {

        this.name = name;
    }

    public PersonClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return String.format("Person {id = %d , name = %s", id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        PersonClass p = (PersonClass) obj;
        if (id != p.id) {
            return false;
        }
        return name.equals(p.name);
    }

    @Override
    public int hashCode() {

        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

}
