import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price of the book: ");
        float price = scanner.nextFloat();

        // forcefully empty the scanner
        scanner.nextLine();

        System.out.println("Enter title of the book: ");
        String title = scanner.nextLine();

        System.out.println("Enter publication house name of the book: ");
        String pubHouse = scanner.nextLine();

        System.out.println("Enter pages of the book: ");
        int pages = scanner.nextInt();

        System.out.println(title);
        System.out.println(price);
        System.out.println(pages);
        System.out.println(pubHouse);
    }
}
