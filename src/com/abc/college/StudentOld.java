package com.abc.college;// Person X

// Every class in Java, occupies some memory in the RAM as a `Class` object
// It is always 1 Class object per class
public class StudentOld {

    // instance variables
    public String name;
    public char gender;
    public double marks;
    private long[] mobileNos; // default value will be null

    // Class object variable
    // shared by all the instances of the class
    public static int count;

    // by default
    // com.abc.college.StudentOld() {}
    // Internally
    /*
        com.abc.college.StudentOld(com.abc.college.StudentOld this) {

        }
     */

    // constructor
    public StudentOld() {
        // this - current object
        // call another constructor of the same class
        // call to this (another constructor) must be the first instruction in this constructor
        this("NA", -1, 'm');
    }

    public StudentOld(String name, char gender) {
        this(name, 0, gender);
    }

    public StudentOld(char gender) {
        this(null, 0.0, gender);
    }

    // whenever we define atleast 1 constructor in a class, we do not get the default constructor
    public StudentOld(String name, double marks, char gender) {
        // this - current object for which this function was called at the time of object creation

        // initalize the attributes of an object
        this.name = name;
        this.marks = marks;
        this.gender = gender;

        // increment the count variable
        // Access the static variable using the class name
        StudentOld.count++;
    }

    // constructor overloading - The input list of the constructor must be varying in terms of number as well as sequence

    public String getDetails() {
        // there is an implicit variable called as `this` available in the method
        // `this` is going to be the current com.abc.college.StudentOld object for which the getDetails() was called
        // this -> s1, s2

        String part1 = "Name: " + this.name + "\nGender: " + this.gender + "\nMarks: " + this.marks;
        // return "Name: " + name + "\nGender: " + gender + "\nMarks: " + marks;

        String part2 = "";
        long[] mobiles = this.mobileNos;
        if (mobiles != null) { // null check
            for (int i = 0; i < mobiles.length; i++) {
                part2 += mobiles[i] + "\n";
            }
        } else {
            part2 = "No Mobile Nos";
        }

        return part1 + "\n" + part2;
    }

    /*
        Internally

        String getDetails(com.abc.college.StudentOld this) {

        }
     */

    public char getGrade() {
        // this - current com.abc.college.StudentOld object
        double marks = this.marks;
        char grade;

        if (marks > 100 || marks < 0) {
            grade = 'I';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static StudentOld createFemale() {
        // System.out.println(this); // there will be no `this` in a static method
        return new StudentOld('f');
    }

    public void setMobileNos(long[] mobileNos) {
        this.mobileNos = mobileNos;
    }
}
