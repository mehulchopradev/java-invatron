import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayStreams {

    // lower order function that mimics the test function from the Predicate functional interface
    private static boolean isEven(Integer element) {
        return element % 2 == 0;
    }

    private static boolean isOdd(Integer element) {
        return !isEven(element);
    }

    // lower order function that mimics the apply function from the Function functional interface
    private static Integer deductOne(Integer element) {
        return element - 1;
    }

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(4, 5, 6, 2, 7, 8, 9, 10, 4, 8, 2, 1, 3);

        System.out.println("*********** From the list nos, get a new list of even elements only ************************");
        // filtering operation

        // filter is an intermediate operation
        // many intermediate operations can be applied throughout the lifecycle of a stream creating new streams

        // once done transforming the stream by applying intermediate operations, apply the terminal operation to convert back to
        // the appropriate collection class or some java object
        List<Integer> evens = nos.stream().filter(PlayStreams::isEven).collect(Collectors.toList());
        System.out.println(evens);

        System.out.println("************ Print the count of the even elements from the nos list ********************");
        // count is a terminal operation
        System.out.println(nos.stream().filter(PlayStreams::isEven).count());

        System.out.println("********* Print distinct even elements from the nos list **********************");
        /* List<Integer> distinctEvens = nos.stream()
                .filter(PlayStreams::isEven)
                .distinct()
                .collect(Collectors.toList()); */
        Set<Integer> distinctEvens = nos.stream()
                .filter(PlayStreams::isEven)
                .collect(Collectors.toSet());
        System.out.println(distinctEvens);

        System.out.println("*********** From the list nos, get a new list of even elements only sorted in ascending order ************************");
        List<Integer> evensSorted = nos.stream()
                .filter(PlayStreams::isEven)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toList());
        System.out.println(evensSorted);


        System.out.println("************ From the list nos, get a new list of odd elements only deducted by 1 *************");
        // filtering + mapping
        List<Integer> oddsDeductedByOne = nos.stream()
                .filter(PlayStreams::isOdd)
                .map(PlayStreams::deductOne)
                .collect(Collectors.toList());
        System.out.println(oddsDeductedByOne);

        System.out.println("**************** Get the average of the nos ***********************************");
        System.out.println(nos.stream().collect(Collectors.averagingInt(number -> number)));


    }
}
