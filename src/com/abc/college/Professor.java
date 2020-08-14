package com.abc.college;

import com.pqr.SalariedIndividual;

// Professor is a CollegeUser
// Professor is a child class of CollegeUser
// Professor is a sub class of CollegeUser

// Professor inherits from CollegeUser inherits from Object (Multilevel inheritance)
final public class Professor extends CollegeUser implements SalariedIndividual {
    // inherit the attributes defined in the super class
    // name, gender

    String[] subjects;

    private int noOfDays;
    private int costPerDay;

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

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void giveAttendance() {
        System.out.println("Attendance given by " + this.name + " by scanning");
    }

    public int getCostPerDay() {
        return this.costPerDay;
    }

    public int getNoOfDays() {
        return this.noOfDays;
    }


    public boolean isEligibleForTaxDeduction() {
        return SalariedIndividual.super.isEligibleForTaxDeduction();
    }
}
