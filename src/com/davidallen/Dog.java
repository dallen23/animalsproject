package com.davidallen;

/**
 * The Dog class is an extension of the pet class which allows for creation of a dog object
 *
 * @author dallen23 on 8/29/2018
 * @version 1.1
 */
public class Dog extends Pet implements Talkable {

    /**
     * @param friendly a boolean of friendly or not
     */
    private boolean friendly;

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;
    }

    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}