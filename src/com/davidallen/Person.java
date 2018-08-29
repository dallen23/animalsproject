package com.davidallen;

/**
 * The Person class allows for the creation and management of a person object
 *
 * @author dallen23 on 8/29/2018
 * @version 1.1
 */
public abstract class Person {

    /**
     * @param name the name of a person object
     */

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}