import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenNos {

    private static void printEvenElement(int element) {
        if (element % 2 == 0) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter n: ");
        int n = scanner.nextInt();

        // print all the even numbers from 0 to n
        // Range of integer numbers from 0 to n

        // IntStream.rangeClosed(0, n).forEach(EvenNos::printEvenElement);
        IntStream.rangeClosed(0, n).forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });
    }
}
