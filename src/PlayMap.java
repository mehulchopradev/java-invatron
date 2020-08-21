import com.abc.college.Book;

import java.util.*;

public class PlayMap {
    public static void main(String[] args) {
        // Book data and every book has a book id (unique)

        Map<String, Book> bookMap = new HashMap<>();

        // add an entry in the map (key, value)
        bookMap.put("B001", new Book("Book 1", 900, 1000));
        bookMap.put("B002", new Book("Book 2", 100, 560));

        System.out.println(bookMap);

        // get an entry from the map
        Book b2 = bookMap.get("B002");
        System.out.println(b2);

        // update an existing entry in the map
        bookMap.put("B001",  new Book("Book 1", 950, 1050));
        System.out.println(bookMap);

        // remove an entry from a map
        bookMap.remove("B001");
        System.out.println(bookMap);

        // checks whether there is an entry in the map for the passed key
        System.out.println(bookMap.containsKey("B001"));
        System.out.println(bookMap.containsKey("B002"));

        bookMap.put("B003", new Book("Book 3", 670, 900));
        bookMap.put("B004", new Book("Book 4", 560, 780));

        // get only the keys from the map
        Set<String> keys = bookMap.keySet();
        System.out.println(keys);

        // get only the values from the map
        Collection<Book> values = bookMap.values();
        System.out.println(values);


        // get key,value together from the map
        Set<Map.Entry<String, Book>> entries = bookMap.entrySet();
        Iterator<Map.Entry<String, Book>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            System.out.println("Book id " + entry.getKey());
            System.out.println("Book title " + entry.getValue().title);
        }
    }
}
