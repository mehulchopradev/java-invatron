// Person Y
public class CreateStudents {

    public static void main(String[] args) {
        // starting point of the project

        Student s1 = new Student();
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

        /* System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.gender);
        System.out.println(s2.gender); */

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
    }
}
