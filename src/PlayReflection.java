import com.abc.college.Book;

import java.util.Arrays;

public class PlayReflection {
    public static void main(String[] args) {
        // every class in java (built in + user defined) has a instance per class that tracks
        // information about the class
        Class<Book> bookClass = Book.class;
        Class<String> stringClass = String.class;

        // inspect all the attributes of the Book class
        // gives only the public fields
        Arrays.stream(bookClass.getFields()).forEach(field -> System.out.println(field.getName()));

        // along with public, gives private, protected, default access specifier
        Arrays.stream(bookClass.getDeclaredFields()).forEach(field -> System.out.println(field.getName()));

        // inspect all the methods of the Book class
        Arrays.stream(bookClass.getDeclaredMethods()).forEach(method -> System.out.println(method.getName()));

        // inspect all the constructors of the Book class
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);
    }
}
