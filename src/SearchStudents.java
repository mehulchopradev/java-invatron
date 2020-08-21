import com.abc.college.Student;

import java.util.*;

public class SearchStudents {
    public static void main(String[] args) {
        /* List<Student> students = Arrays.asList(
                new Student("mehul", 'm', 10),
                new Student("jane", 'f', 5),
                new Student("jill", 'f', 23),
                new Student("rock", 'm', 15)
        ); */

        Map<Integer, Student> studentMap = new HashMap<>();
        // hash algorithm is key % 5 = bucket
        studentMap.put(10, new Student("mehul", 'm', 10)); // 10 % 5 = 0 bucket
        studentMap.put(6, new Student("jane", 'f', 6)); // 6 % 5 = 1 bucket
        studentMap.put(23, new Student("jill", 'f', 23));// 23 % 5 = 3 bucket
        studentMap.put(15, new Student("rock", 'm', 15)); // 15 % 5 = 0 bucket

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll no to start searching: ");
        int searchRoll = scanner.nextInt();

        Student student = studentMap.get(searchRoll);
        if (student != null) {
            System.out.println(student.getDetails());
        } else {
            System.out.println("Student not found");
        }

        /* boolean studentFound = false;
        for (Student student: students) {
            if (student.roll == searchRoll) {
                studentFound = true;
                System.out.println(student.getDetails());
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student not found!");
        } */
    }
}
