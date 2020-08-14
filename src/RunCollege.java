import com.abc.college.CollegeUser;
import com.abc.college.Professor;
import com.abc.college.Student;
import com.abc.college.photo.PhotoSession;

public class RunCollege {
    public static void main(String[] args) {
        int i = 6;

        final Student s = new Student("jane", 'f', 10);
        // 1 new reserve a memory in the RAM - 9008
        // 2 Student("jane", 'f', 10, 9008)
        s.getNameRoll();

        CollegeUser c1 = new Student("rahul", 'm', 11);
        // c1.getNameRoll(); // this would not work as during compilation getNameRoll is not known to the class type (CollegeUser)
        // of variable c1

        c1.getDetails(); // will invoke the overriden getDetails() in Student class

        // Professor p2 = (Professor)c1; //will not work at runtime. Will give ClassCastException


        // Polymorphism
        // a super class type variable can store the address of any of its subclass objects. but not vice versa
        Object o = new Student("rahul", 'm', 11);

        Professor p = new Professor("mehul", 'm', null);
        // 1 new reserve a memory in the RAM - 9009
        // 2 Professor("mehul", 'm', null, 9009)

        CollegeUser c2 = new Professor("kathy", 'f', null);

        // System.out.println(i);

        // System.out.println(s);
        // Internally
        // System.out.println(s.toString());
        // System.out.println(Student.toString(s));

        // System.out.println(p);

        /* System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.gender);

        System.out.println(p.name);
        System.out.println(p.gender); */

        // System.out.println(s.getDetails());
        // Student.getDetails(s)

        // System.out.println(p.getDetails());
        // Professor.getDetails(p)

        // since s is final, it cannot be reassigned to another value
        // s = new Student("jill", 'f', 90);

        // PhotoSession.takePhoto(s);
        // PhotoSession.takePhoto(p);

        // Users of my class must not be able to create CollegeUser objects in the memory

        // cannot create an object of an abstract class
        // CollegeUser c3 = new CollegeUser("invisible man", 'm');

        // CollegeUser c4;
        // CollegeUser c5 = new Student("dfg", 'f', 10);

        s.giveAttendance();
        p.giveAttendance();

    }
}
