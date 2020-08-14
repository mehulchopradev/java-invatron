package com.abc.college;

// CollegeUser parent class
// CollegeUser super class
public abstract class CollegeUser { // extends Object { //every class in java implicitly inherits from the built in class Object

    protected String name;
    protected char gender;

    public CollegeUser(String name, char gender) {
        // this - Student object, professor object, any subclass object of CollegeUser
        this.name = name;
        this.gender = gender;
    }

    public String getDetails() {
        // this - Student object, Professor object
        return "Name: " + this.name + "\nGender: " + this.gender;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return gender;
    }

    // automatially put by the compiler
    /* CollegeUser() {
        // this - Student object, Professor object, any subclass object of CollegeUser
    } */

    // overriding the method inherited from the Object class

    // final - Method is inherited, but none of the subclasses can override this method
    public final String toString() {
        // this - current object
        return this.name + "," + this.gender;
    }

    // a class with minimum one abstract method must be compulsorily marked as abstract
    public abstract void giveAttendance();

    // Most restrictive to least restrictive
    // 1. private
    // 2. protected
    // 3. <<default>>
    // 4. public
}
