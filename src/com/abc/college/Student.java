package com.abc.college;

// Student is a CollegeUser
// Student is a child class of CollegeUser
// Student is a sub class of CollegeUser

import java.util.Objects;

// a final class cannot be extended further in the inheritance tree
final public class Student extends CollegeUser {
    // inherit the attributes defined in the super class
    // name, gender
    public int roll;

    // methods are also inherited in the subclass
    // getDetails

    public Student(String name, char gender, int roll) {
        // this - current object - Student object
        // automatically placed by the compiler
        // super(); // call ur super class no argument constructor
        // Internally
        // CollegeUser(this)

        super(name, gender);
        this.roll = roll;
    }

    // method overriding
    public String getDetails() {
        String part1 = super.getDetails(); // forcibly call the super class inherited method and not the override one
        String part2 = "\nRoll : " + this.roll;
        return part1 + part2;
    }

    public void giveAttendance() {
        System.out.println("Attendance given by " + this.name + " by logging to website");
    }

    public String[] getNameRoll() {
        String[] result = {this.name, this.roll + ""};
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
