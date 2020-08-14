
import com.abc.college.Author;
import com.abc.college.Book;

public class CreateBooks {

    public static void main(String[] args) {
        Book b1 = new Book("programming in java", 1000, -900);

        // b1.price = 800; // set the value of price
        // b1.price = -600; // set the value of price, they shud not be allowed and shud print an error

        // b1.setPrice(800);
        // b1.setPrice(-600);

        System.out.println(b1.getDetails());
        // System.out.println(b1.price); // get the value of price
        System.out.println(b1.getPrice());

        Author[] authors1 = {
                new Author("mehul", 'm', 5),
                new Author("mark", 'm', 4)
        };

        Book b2 = new Book("programming in scala", 560, 100, authors1);
        System.out.println(b2.getDetails());
    }
}
