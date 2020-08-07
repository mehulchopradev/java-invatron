// Person Y
public class CreateStudents {

    public static void main(String[] args) {
        // starting point of the project

        System.out.println(Student.count);

        Student s1 = new Student();
        // 1. new operator will reserve some area in the memory RAM for this Student object - 9001
        // 2. Student() - Student(9001)

        // Reserve some memory in the RAM at address 9003
        s1.name = "mehul";
        s1.gender = 'm';
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "jane";
        s2.gender = 'f';
        s2.marks = 34;
        // Reserve some memory in the RAM at address 9007

        // System.out.println(s1);
        // System.out.println(s2);

        Student s3 = new Student("jill", 67, 'f');
        //1. new operator will reserve some area in the memory RAM for this Student object - 9009
        // 2. Student("jill", 67, 'f') - Student("jill", 67, 'f', 9009)

        /* System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.gender);
        System.out.println(s2.gender); */

        System.out.println(Student.count);

        System.out.println(s1.getDetails());
        // s1.getDetails()
        // Internally
        // Student.getDetails(s1)


        System.out.println(s2.getDetails());
        // s2.getDetails()
        // Internally
        // Student.getDetails(s2)

        System.out.println(s1.getGrade());
        // Internally
        // Student.getGrade(s1)


        System.out.println(s2.getGrade());

        System.out.println(s3.getDetails());

        Student s4 = new Student();
        System.out.println(s4.getDetails());

        System.out.println(Student.count);

        // calling a method directly on the class
        // static methods
        Student s5 = Student.createFemale();
        // Internally
        // Student.createFemale()

        Student s6 = Student.createFemale();
        Student s7 = Student.createFemale();
        Student s8 = Student.createFemale();

        System.out.println(s6.getDetails());
        System.out.println(s7.getDetails());
    }
}
