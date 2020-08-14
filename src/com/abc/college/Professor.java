package com.abc.college;

// Professor is a CollegeUser
// Professor is a child class of CollegeUser
// Professor is a sub class of CollegeUser

// Professor inherits from CollegeUser inherits from Object (Multilevel inheritance)
final public class Professor extends CollegeUser {
    // inherit the attributes defined in the super class
    // name, gender

    String[] subjects;

    // methods are also inherited in the subclass
    // getDetails

    public Professor(String name, char gender, String[] subjects) {
        // this - current object - Professor object
        // automatically placed by the compiler
        // super(); // call ur super class no argument constructor
        // Internally
        // CollegeUser(this)

        super(name, gender);
        this.subjects = subjects;
    }


    public void giveAttendance() {
        System.out.println("Attendance given by " + this.name + " by scanning");
    }
}
