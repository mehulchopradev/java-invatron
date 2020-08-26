import com.abc.college.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListBooks {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Programming in Java", 900, 560),
                new Book("Programming in python", 800, 600),
                new Book("Java in action", 1000, 900),
                new Book("Blockchain programming", 1500, 870),
        };

        // get all the book titles in upper case of only those books whose price is more than 600
        // array to a stream
        List<String> bookTitles = Arrays.stream(books)
                .filter(book -> book.getPrice() > 600)
                .map(book -> book.title.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(bookTitles);

        // get all the book information of those books that have Java mentioned in its title, sorted in the descending order of price
        Arrays.stream(books)
                .filter(book -> book.title.contains("Java"))
                .sorted((b1, b2) -> {
                    return new Double(b2.getPrice()).compareTo(b1.getPrice());
                })
                .forEach(book -> {
                    System.out.println(book.getDetails());
                });
    }
}
