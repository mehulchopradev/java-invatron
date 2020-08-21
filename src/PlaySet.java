import java.util.*;

public class PlaySet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // add elements
        fruits.add("banana");
        fruits.add("chicku");
        fruits.add("banana"); // ignore and will not add element to set and will not even raise an exception

        System.out.println(fruits);

        // remove element
        fruits.remove("chicku");

        System.out.println(fruits);

        fruits.add("apple");
        fruits.add("mango");

        // consists of an element
        System.out.println(fruits.contains("apple"));

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        List<Integer> pointers = Arrays.asList(5, 6, 7, 10, 4, 5, 10, 6, 10, 5, 9, 2, 7, 10);

        // unique set of pointers scored in the class
        Set<Integer> uniquePointers = new HashSet<>(pointers);
        System.out.println(uniquePointers);

        List<Integer> marks1 = Arrays.asList(4, 5, 6, 7);
        List<Integer> marks2 = Arrays.asList(10, 5, 7, 8);



        Set<Integer> smark1 = new HashSet<>(marks1);
        Set<Integer> smarks2 = new HashSet<>(marks2);

        // intersection
        smark1.retainAll(smarks2);
        System.out.println(smark1);
    }
}
