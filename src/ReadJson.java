import com.abc.college.Book;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadJson {
    public static void main(String[] args) {
        String path = "/home/mehul/Documents/book.json";

        Gson gson = new Gson();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            /* Book book = gson.fromJson(br, Book.class);
            System.out.println(book.getDetails()); */
            Book[] books = gson.fromJson(br, Book[].class);
            Arrays.stream(books).forEach(book -> {
                System.out.println(book.getDetails());
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
