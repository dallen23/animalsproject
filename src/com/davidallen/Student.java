package com.davidallen;

/**
 * The Student class is an extention on the Person class, which implements Talkable and creates/controls Student objects
 *
 * @author dallen23 on 8/29/2018
 * @version 1.1
 */
public class Student extends Person implements Talkable {

    /**
     * @param age the age of a person object
     */

    private int age;

    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
