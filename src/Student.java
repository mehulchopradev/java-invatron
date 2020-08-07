// Person X

// Every class in Java, occupies some memory in the RAM as a `Class` object
// It is always 1 Class object per class
public class Student {

    // instance variables
    String name;
    char gender;
    double marks;

    // Class object variable
    // shared by all the instances of the class
    static int count;

    // by default
    // Student() {}
    // Internally
    /*
        Student(Student this) {

        }
     */

    // constructor
    Student() {
        // this - current object
        // call another constructor of the same class
        // call to this (another constructor) must be the first instruction in this constructor
        this("NA", -1, 'm');
    }

    Student(String name, char gender) {
        this(name, 0, gender);
    }

    Student(char gender) {
        this(null, 0.0, gender);
    }

    // whenever we define atleast 1 constructor in a class, we do not get the default constructor
    Student(String name, double marks, char gender) {
        // this - current object for which this function was called at the time of object creation

        // initalize the attributes of an object
        this.name = name;
        this.marks = marks;
        this.gender = gender;

        // increment the count variable
        // Access the static variable using the class name
        Student.count++;
    }

    // constructor overloading - The input list of the constructor must be varying in terms of number as well as sequence

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

    static Student createFemale() {
        // System.out.println(this); // there will be no `this` in a static method
        return new Student('f');
    }
}
