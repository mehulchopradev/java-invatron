package com.pqr;

public interface SalariedIndividual {

    // public static final
    int TAX_BARRIER = 10000;

    // an interface does not have concept of constructors
    // no concept of instance variables
    // doesnt take part in object creation process (as abstract classes do)

    //all no braces methods of an interface are by default public and abstract

    // apart from enforcing contract
    int getCostPerDay();

    int getNoOfDays();

    // java 8
    // functions inherited also in the downstream subclasses
    default boolean isEligibleForTaxDeduction() {
        // this - object that implements the interface
        // object would have compulsorily followed the above contract
        int totalCost = this.getCostPerDay() * this.getNoOfDays();
        return totalCost < TAX_BARRIER ? false : true;
    }

    default double calculate() {
        // this - object that implements the interface
        // object would have compulsorily followed the above contract

        // from that individual object we get the cost per day - x
        int costPerDay = this.getCostPerDay();

        // from that individual object we get the no of days worked in a month - y
        int noOfDays = this.getNoOfDays();

        // salaryWithoutTaxDeducted = x * y
        int salaryWithoutTaxDeducted = costPerDay * noOfDays;

        // salaryWithTaxDeducted = salaryWithoutTaxDeducted - 0.1 * salaryWithoutTaxDeducted
        double salaryWithTaxDeducted = salaryWithoutTaxDeducted - (0.1 * salaryWithoutTaxDeducted);

        // return salaryWithTaxDeducted
        return salaryWithTaxDeducted;
    }

    // java8 allows static methods also to be defined in an interface
    static String getTaxStructure() {
        return "If cost >= 10,000 eligible for 10% tax deduction else no tax deduction";
    }
}
