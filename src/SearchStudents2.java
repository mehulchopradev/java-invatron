import com.abc.college.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SearchStudents2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("mehul", 'm', 10),
                new Student("jane", 'f', 5),
                new Student("jill", 'f', 23),
                new Student("rock", 'm', 15)
        );

        // System.out.println(students.stream().collect(Collectors.groupingBy(student -> student.getGender())));

        List<String> females = students.stream()
                .filter(student -> student.getGender() == 'f')
                .map(student -> student.getName())
                .collect(Collectors.toList());

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll no to start searching: ");
        int searchRoll = scanner.nextInt();

        Student searchStudent = new Student("", 'm', searchRoll);
        System.out.println(students.contains(searchStudent)); */
    }
}
