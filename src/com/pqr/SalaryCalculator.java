package com.pqr;

public class SalaryCalculator {

    public static double calculate(SalariedIndividual individual) {
        // from that individual object we get the cost per day - x
        int costPerDay = individual.getCostPerDay();

        // from that individual object we get the no of days worked in a month - y
        int noOfDays = individual.getNoOfDays();

        // salaryWithoutTaxDeducted = x * y
        int salaryWithoutTaxDeducted = costPerDay * noOfDays;

        // salaryWithTaxDeducted = salaryWithoutTaxDeducted - 0.1 * salaryWithoutTaxDeducted
        double salaryWithTaxDeducted = salaryWithoutTaxDeducted - (0.1 * salaryWithoutTaxDeducted);

        // return salaryWithTaxDeducted
        return salaryWithTaxDeducted;
    }
}
