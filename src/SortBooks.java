import com.abc.college.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBooks {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Book 1", 100, 900),
                new Book("Book 2", 400, 800),
                new Book("Book 3", 98, 900),
                new Book("Book 4", 500, 900),
                new Book("Book 5", 200, 800));

        /*
        900 98
        900 100
        900 500
        800 200
        800 400
         */

        Comparator<Book> byPriceDesc = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return new Double(o2.getPrice()).compareTo(o1.getPrice());
            }
        };

        Comparator<Book> byPagesAsc = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return new Integer(o1.getPages()).compareTo(o2.getPages());
            }
        };

        books.sort(byPriceDesc.thenComparing(byPagesAsc));
        System.out.println(books);
    }
}
