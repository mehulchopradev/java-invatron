import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PlayMoreLists {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(4, 5, 6, 2, 7, 8, 9, 10, 4, 8, 2, 1, 3);

        System.out.println("************ Print all numbers from the nos list one per line**************");
        printAllNumbers(nos);

        System.out.println("************* Print all the odd numbers from the nos list one per line *********");
        printAllOddNumbers(nos);
    }

    @FunctionalInterface
    interface Action {
        void performAction(Integer element);
    }


    // higher order function
    private static void forEach(List<Integer> elements, Action action) {
        for (Integer element: elements) {
            action.performAction(element);
        }
    }

    // lower order functions
    private static void printOddElement(Integer element) {
        if (element % 2 != 0) {
            System.out.println(element);
        }
    }

    // looping logic is repeating and pretty static and imperative
    // actions inside the looping that are applied to every element are different
    private static void printAllOddNumbers(List<Integer> nos) {
        // Functional programming

        nos.forEach(PlayMoreLists::printOddElement);

        // Method references
        // forEach(nos, PlayMoreLists::printOddElement);

        // callback functions
        // lambda expressions can be only be equated to an interface that has only one abstract method
        /* forEach(nos, element -> {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }); */
        /* forEach(nos, new Action() {

            // lower order function
            @Override
            public void performAction(Integer element) {
                if (element % 2 != 0) {
                    System.out.println(element);
                }
            }
        }); */
        /* for (Integer no: nos) {
            if (no % 2 != 0) {
                System.out.println(no);
            }
        } */
    }

    private static void printAllNumbers(List<Integer> nos) {

        nos.forEach(System.out::println);

        // Method references
        // forEach(nos, System.out::println);

        // lambda expressions
        // annoynmous inner class syntax much more approachable and readable
        // forEach(nos, element -> System.out.println(element));


        /* forEach(nos, new Action() {
            @Override
            public void performAction(Integer element) {
                System.out.println(element);
            }
        }); */
        /* for (Integer no: nos) {
            System.out.println(no);
        } */
    }
}
