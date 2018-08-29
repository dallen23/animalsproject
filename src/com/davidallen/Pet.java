package com.davidallen;

/**
 * The Pet class allows for the creation of a pet object.
 *
 * @author dallen23 on 8/29/2018
 * @version 1.1
 */
public abstract class Pet {

    /**
     * @param name the name of a pet object
     */

    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}