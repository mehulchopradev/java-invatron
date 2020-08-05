// Person X
public class Student {

    // instance variables
    String name;
    char gender;
    double marks;

    String getDetails() {
        // there is an implicit variable called as `this` available in the method
        // `this` is going to be the current Student object for which the getDetails() was called
        // this -> s1, s2

        return "Name: " + this.name + "\nGender: " + this.gender + "\nMarks: " + this.marks;
        // return "Name: " + name + "\nGender: " + gender + "\nMarks: " + marks;
    }

    /*
        Internally

        String getDetails(Student this) {

        }
     */

    char getGrade() {
        // this - current Student object
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
}
