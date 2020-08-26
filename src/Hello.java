import java.util.Scanner;

public class Hello {

    @Main
    private void start() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Math.sqrt(number));
    }
}
