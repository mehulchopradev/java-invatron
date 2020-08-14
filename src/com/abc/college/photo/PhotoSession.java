package com.abc.college.photo;

import com.abc.college.CollegeUser;
import com.abc.college.Student;

public class PhotoSession {

    public static void takePhoto(CollegeUser cu) {
        // cu can store address of Student, Professor or any subclass object of CollegeUser

        // if cu stores address of Student object
        if (cu instanceof Student) {
            // print name, gender, roll
            // Convert data type of variable cu from CollegeUser to Student only with the assurance
            // that it is convertable
            Student s = (Student)cu;
            System.out.println("Photo taken of " + s.getName() + ". Gender is " + s.getGender() + ". Roll is " + s.roll);
        } else {
            System.out.println("Photo taken of " + cu.getName() + ". Gender is " + cu.getGender());
        }
    }

    /* public static void takePhoto(Student student) {
        System.out.println("Photo taken of " + student.getName() + ". Gender is " + student.getGender());
    }

    public static void takePhoto(Professor professor) {
        System.out.println("Photo taken of " + professor.getName() + ". Gender is " + professor.getGender());
    } */
}
