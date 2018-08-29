package com.davidallen;

import org.junit.Test;

/**
 * The Cat class is an extension of a pet class and allows for the creation of a cat object which implements the Talkable class
 *
 * @author dallen23 on 8/29/2018
 * @version 1.1
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled is the number of mice a cat has killed
     * @param name is passed into the cat method to create a cat object from a pet object
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    public int getMousesKilled() {
        return mousesKilled;
    }

    public void addMouse() {
        mousesKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

