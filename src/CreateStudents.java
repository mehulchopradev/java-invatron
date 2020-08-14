import com.abc.college.StudentOld;

// Person Y

public class CreateStudents {

    public static void main(String[] args) {
        // starting point of the project

        System.out.println(StudentOld.count);

        StudentOld s1 = new StudentOld();
        // 1. new operator will reserve some area in the memory RAM for this com.abc.college.StudentOld object - 9001
        // 2. com.abc.college.StudentOld() - com.abc.college.StudentOld(9001)

        // Reserve some memory in the RAM at address 9003
        s1.name = "mehul";
        s1.gender = 'm';
        s1.marks = 90;

        StudentOld s2 = new StudentOld();
        s2.name = "jane";
        s2.gender = 'f';
        s2.marks = 34;

        long[] mobiles = {9868687686l, 876868768l};
        s2.setMobileNos(mobiles);
        // Reserve some memory in the RAM at address 9007

        // System.out.println(s1);
        // System.out.println(s2);

        StudentOld s3 = new StudentOld("jill", 67, 'f');
        //1. new operator will reserve some area in the memory RAM for this com.abc.college.StudentOld object - 9009
        // 2. com.abc.college.StudentOld("jill", 67, 'f') - com.abc.college.StudentOld("jill", 67, 'f', 9009)

        /* System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.gender);
        System.out.println(s2.gender); */

        System.out.println(StudentOld.count);

        System.out.println(s1.getDetails());
        // s1.getDetails()
        // Internally
        // com.abc.college.StudentOld.getDetails(s1)


        System.out.println(s2.getDetails());
        // s2.getDetails()
        // Internally
        // com.abc.college.StudentOld.getDetails(s2)

        System.out.println(s1.getGrade());
        // Internally
        // com.abc.college.StudentOld.getGrade(s1)


        System.out.println(s2.getGrade());

        System.out.println(s3.getDetails());

        StudentOld s4 = new StudentOld();
        System.out.println(s4.getDetails());

        System.out.println(StudentOld.count);

        // calling a method directly on the class
        // static methods
        StudentOld s5 = StudentOld.createFemale();
        // Internally
        // com.abc.college.StudentOld.createFemale()

        StudentOld s6 = StudentOld.createFemale();
        StudentOld s7 = StudentOld.createFemale();
        StudentOld s8 = StudentOld.createFemale();

        System.out.println(s6.getDetails());
        System.out.println(s7.getDetails());
    }
}
